package kr.co.kokono.recipe.chap03.r3_2.service;


import kr.co.kokono.recipe.chap03.r3_2.domain.Member;

import java.util.List;

public interface MemberService {

    void add(Member member);

    void remove(String memberName);

    List<Member> list();
}
