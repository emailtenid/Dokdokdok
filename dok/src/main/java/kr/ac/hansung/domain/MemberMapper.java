package kr.ac.hansung.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MemberMapper implements RowMapper<Member> {

	public Member mapRow(ResultSet rs, int rowNum) throws SQLException {

		Member member = new Member();

		member.setId(rs.getString("id"));
		member.setPassword(rs.getString("password"));

		return member;
	}

}
