package kr.co.kokono.recipe.chap03.r3_2.service;

import kr.co.kokono.recipe.chap03.r3_2.domain.Member;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
class MemberServiceImpl implements MemberService {

    private final Map<String, Member> members = new HashMap<>();

    public void add(Member member) {
        members.put(member.getName(), member);
    }

    public void remove(String memberName) {
        members.remove(memberName);
    }

    public List<Member> list() {
        return new ArrayList<>(members.values());
    }
}
