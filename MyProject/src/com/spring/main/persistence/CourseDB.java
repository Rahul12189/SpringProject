package com.spring.main.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.main.model.Course;
import com.spring.main.model.Department;

@Component
public class CourseDB {

	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

	}

	public List<Course> fetchCourses() {
		// TODO Auto-generated method stub
		String sql = "select course.id ,course.name ,credits,department.id, department.name from course ,department where course.department_id = department.id";
		return jdbcTemplate.query(sql, new A());
	}

}

class A implements RowMapper<Course> {

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Course c = new Course();
		Department d = new Department();
		c.setId(rs.getInt("id"));
		c.setName(rs.getString("name"));
		c.setCredit(rs.getInt("credits"));
		d.setId(rs.getInt("department_id"));
		d.setName(rs.getString("department_name"));

		c.setDepartment(d);
		return c;
	}

}