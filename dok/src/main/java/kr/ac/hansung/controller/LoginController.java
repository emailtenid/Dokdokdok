package kr.ac.hansung.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.ac.hansung.domain.Member;
import kr.ac.hansung.service.LoginService;

@Controller
@SessionAttributes({"id","password"})
public class LoginController {
	private LoginService loginService;

	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@RequestMapping("/dologin")
	public String showLogin(HttpServletRequest request, Model model) {

		String cid = request.getParameter("id");
		String cpassword = request.getParameter("password");
		
		Member student = loginService.check(cid, cpassword);

		if (student!= null) {

			model.addAttribute("id", student.getId());
			model.addAttribute("password", student.getPassword());

			return "dologin";
		} else {
			return "loginfail";
		}
	}
}