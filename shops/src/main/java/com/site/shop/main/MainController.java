package com.site.shop.main;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "/main";
	}
	@GetMapping("login")
	public String login() {
		return "/login";
	}
	@GetMapping("join")
	public String join() {
		return "/step01";
	}
	@GetMapping("main")
	public String main() {
		return "/main";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("session_id", null);
		System.out.println(session.getAttribute("session_id"));
		return "/login";
	}
	@GetMapping("/coolsmsPopup")
	public String coolsmsPopup() {
		return "/coolsmsPopup";
	}
	@GetMapping("/step02")
	public String step02() {
		return "/step02";
	}
	@GetMapping("/step03")
	public String step03() {
		return "/step03";
	}
	@GetMapping("/step04")
	public String step04() {
		return "/step04";
	}
	@GetMapping("/step05")
	public String step05() {
		return "/step05";
	}
}
