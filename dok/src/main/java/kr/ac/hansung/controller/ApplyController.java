package kr.ac.hansung.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.service.ApplyService;

@Controller
public class ApplyController {
	private ApplyService applyService;

	@Autowired
	public void setApplyService(ApplyService applySercive) {
		this.applyService = applySercive;
	}

	@RequestMapping("/apply")
	public String showApply(HttpServletRequest request, Model model) {

		String id = request.getParameter("id");
		String book_name = request.getParameter("book_name");
		String apply_text = request.getParameter("apply_text");

		Boolean result = applyService.applyBook(id, book_name, apply_text);

		if (result) {
			model.addAttribute("id", id);
			model.addAttribute("book_name", book_name);
			model.addAttribute("apply_text", apply_text);

			return "applysuccess";
		} else {
			return "home";
		}
	}
}