package com.site.shop.member;

public interface MemberService {

	MemberVo login(String id, String pw);

	void certifiedPhoneNumber(String userPhoneNumber, int randomNumber);
}