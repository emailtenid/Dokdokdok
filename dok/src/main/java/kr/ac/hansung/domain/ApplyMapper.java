package kr.ac.hansung.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ApplyMapper implements RowMapper<Apply> {

	public Apply mapRow(ResultSet rs, int rowNum) throws SQLException {

		Apply apply = new Apply();

		apply.setId(rs.getString("id"));
		apply.setBook_name(rs.getString("book_name"));
		apply.setApply_text(rs.getString("apply_text"));

		return apply;
	}

}
