package com.liquidstore.dao;

import com.liquidstore.model.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDAO {

    void insertMember(Member member);

    Member getMemberByUsername(String username);

    List<Member> getAllMembers();

    void deleteMember(int id);
}
