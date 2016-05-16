package kr.ac.hansung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.ApplyDAO;
import kr.ac.hansung.domain.Apply;

@Service("applyService")
public class ApplyService {
	private ApplyDAO applyDAO;

	@Autowired
	public void setApplyDAO(ApplyDAO applyDAO) {
		this.applyDAO = applyDAO;
	}

	public Boolean applyBook(String id, String book_name, String apply_text) {

		Boolean insertcheck = applyDAO.insertApplyInfo(id, book_name, apply_text);

		return insertcheck;
	}
}
