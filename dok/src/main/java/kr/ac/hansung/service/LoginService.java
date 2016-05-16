package kr.ac.hansung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.MemberDAO;
import kr.ac.hansung.domain.Member;

@Service("loginService")
public class LoginService {
	private MemberDAO memberDAO;

	@Autowired
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public Member check(String id, String password){
		
		Member student = memberDAO.getMember(id);
		
		if(student.getPassword().equals(password)){
			return student;
		}
		else{
			return null;		
		}
	}
}