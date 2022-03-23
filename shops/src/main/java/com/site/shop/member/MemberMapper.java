package com.site.shop.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

	MemberVo login(String id, String pw);

	int join(MemberVo memberVo);

	int overlap(String m_id);
	
}
