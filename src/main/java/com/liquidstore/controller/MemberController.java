package com.liquidstore.controller;

import com.liquidstore.model.Member;
import com.liquidstore.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public String listMembers(Model model) {
        List<Member> members = memberService.getAllMembers();
        model.addAttribute("members", members);
        return "member/list";
    }

    @GetMapping("/new")
    public String newMemberForm(Model model) {
        model.addAttribute("member", new Member());
        return "member/new";
    }

    @PostMapping("/save")
    public String saveMember(@ModelAttribute Member member) {
        memberService.insertMember(member);
        return "redirect:/members";
    }

    @GetMapping("/{id}")
    public String showMember(@PathVariable("id") int id, Model model) {
        Member member = memberService.getMemberByUsername(String.valueOf(id));
        model.addAttribute("member", member);
        return "member/show";
    }

    @GetMapping("/delete/{id}")
    public String deleteMember(@PathVariable("id") int id) {
        memberService.deleteMember(id);
        return "redirect:/members";
    }
}
