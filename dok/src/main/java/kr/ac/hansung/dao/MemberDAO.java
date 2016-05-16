package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.ac.hansung.domain.Member;
import kr.ac.hansung.domain.MemberMapper;

@Component
public class MemberDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	/*
	public Member getMember(String id) {
		String sqlStatement = "select * from member where id=?";

		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { id }, new MemberMapper());
	}
	
	public List<Member> getMembers() {
		String sqlStatement = "select * from member";

		return jdbcTemplateObject.query(sqlStatement, new MemberMapper());
	}
	*/
	
	public Member getMember(String id){
		String sqlStatement = "select * from member where id=?";
				
		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { id }, new MemberMapper());		
	}

}