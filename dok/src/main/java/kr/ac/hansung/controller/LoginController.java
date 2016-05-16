package kr.ac.hansung.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.dao.Member;
import kr.ac.hansung.service.LoginService;

@Controller
public class LoginController {
	private LoginService loginService;

	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@RequestMapping("/dologin")
	public String showLogin(HttpServletRequest request, Model model) {

		Member student = loginService.check(request.getParameter("id"));

		if (student == null) {
			return "loginfail";
		} else {
			model.addAttribute("id", student.getId());
			model.addAttribute("password", student.getPassword());

			return "dologin";
		}
	}
}