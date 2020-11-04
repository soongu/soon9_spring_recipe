package kr.co.kokono.recipe.chap03.r3_2.controller;

import kr.co.kokono.recipe.chap03.r3_2.domain.Member;
import kr.co.kokono.recipe.chap03.r3_2.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @RequestMapping("/member/add")
    public String addMember(Model model) {
        memberService.add(new Member());
        model.addAttribute("member", new Member());
        model.addAttribute("guests", memberService.list());
        return "memberList";
    }

    // 메서드를 /member/remove, /member/delete 두 URL에 매핑합니다.
    @RequestMapping(value = {"/member/remove", "/member/delete"}, method = RequestMethod.GET)
    public String removeMember(@RequestParam("memberName")
                                       String memberName) {
        memberService.remove(memberName);

        // 리스트를 갱신하기 위해 리다이렉트합니다.
        return "redirect:";
    }

}
