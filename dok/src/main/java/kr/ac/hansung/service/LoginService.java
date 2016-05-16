package kr.ac.hansung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.Member;
import kr.ac.hansung.dao.MemberDAO;

@Service("loginService")
public class LoginService {
	private MemberDAO memberDAO;

	@Autowired
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public Member check(String id){
		
		Member student = memberDAO.getMember(id);
		
		if(student.getId()==null){
			return null;
		}
		else{
			return student;		
		}
	}
}