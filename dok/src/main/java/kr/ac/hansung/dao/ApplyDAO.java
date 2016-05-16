package kr.ac.hansung.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.ac.hansung.domain.Apply;


@Component
public class ApplyDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSoure(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public boolean insertApplyInfo(String id, String book_name, String apply_text) {
		
		String sqlStatement = "insert into apply (id, book_name, apply_text) values (?, ?, ?)";
		
		return (jdbcTemplateObject.update(sqlStatement, new Object[] { id, book_name, apply_text }) == 1);
	}

}
