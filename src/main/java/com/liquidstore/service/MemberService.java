package com.liquidstore.service;

import com.liquidstore.dao.MemberDAO;
import com.liquidstore.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberDAO memberDAO;

    public void insertMember(Member member) {
        memberDAO.insertMember(member);
    }

    public Member getMemberByUsername(String username) {
        return memberDAO.getMemberByUsername(username);
    }

    public List<Member> getAllMembers() {
        return memberDAO.getAllMembers();
    }

    public void deleteMember(int id) {
        memberDAO.deleteMember(id);
    }
}
