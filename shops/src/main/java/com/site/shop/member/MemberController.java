package com.site.shop.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@PostMapping("loginBtn")
	@ResponseBody
	public int login(@RequestParam(required = false) String id, 
					@RequestParam(required = false) String pw, HttpSession session) {
		int result = 0;
		MemberVo memberVo = memberService.login(id, pw);
		if(memberVo != null) {
			session.setAttribute("session_id", id);
			result = 1;
		}
		return result;
	}
	
	@RequestMapping(value = "/phoneCheck", method = RequestMethod.GET)
	@ResponseBody
	public String sendSMS(@RequestParam("phone") String userPhoneNumber) {
		int randomNumber = (int)((Math.random()*(9999 - 1000 + 1)) + 1000);
		memberService.certifiedPhoneNumber(userPhoneNumber, randomNumber);
		return Integer.toString(randomNumber);
	}
	
	
	@PostMapping("/joinStart")
	@ResponseBody
	public int joinStart(MemberVo memberVo) {
		int result = memberService.join(memberVo);
		return result;
	}
}
