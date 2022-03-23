package com.site.shop.member;

public interface MemberService {

	MemberVo login(String id, String pw);

	void certifiedPhoneNumber(String userPhoneNumber, int randomNumber);

	int join(MemberVo memberVo);

	int overlap(String m_id);
}