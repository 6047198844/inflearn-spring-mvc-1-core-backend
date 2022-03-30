package hello.inflearnspringmvc1corebackend.web.frontcontroller.v3.controller;

import hello.inflearnspringmvc1corebackend.domain.member.Member;
import hello.inflearnspringmvc1corebackend.domain.member.MemberRepository;
import hello.inflearnspringmvc1corebackend.web.frontcontroller.ModelView;
import hello.inflearnspringmvc1corebackend.web.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        final List<Member> members = memberRepository.findAll();
        final ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);

        return mv;
    }
}
