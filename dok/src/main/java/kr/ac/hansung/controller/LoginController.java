package kr.ac.hansung.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.ac.hansung.domain.Member;
import kr.ac.hansung.service.LoginService;

@Controller
public class LoginController {
	private LoginService loginService;

	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	
	

	@RequestMapping("/dologin")
	public String showLogin(HttpServletRequest request, Model model, HttpSession session) {

		String cid = request.getParameter("id");
		String cpassword = request.getParameter("password");

		Member member = loginService.check(cid, cpassword);

		if (member != null) {
			session.setAttribute("member", member);

			return "dologin";
		} else {
			return "loginfail";
		}
	}
	
	@RequestMapping("/apply")
	public String showapply() {

		return "apply";
	}
	
}