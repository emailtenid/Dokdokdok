package kr.ac.hansung.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.domain.Member;

@Controller
public class ViewController {
	@RequestMapping("/view")
	public String showView(Model model) {

		return "view";

	}

}
