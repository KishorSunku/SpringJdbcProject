package com.skr.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.skr.dao.IStudentDAO;
import com.skr.model.Student;
@Repository
public class StudentDaoImpl implements IStudentDAO {
	private static final String CREATE_STUDENT_TABLE="create Table STUDENT1(SID NUMBER,SNAME VARCHAR2 (20),SMARKS FLOAT)";
	private static final String INSERT_STUDENT_TABLE="INSERT INTO  STUDENT1 values (101,'KISHOR',100)";
	private static final String GET_STUDENT="SELECT SID,SNAME,SMARKS FROM STUDENT1 WHERE SID=101 and SNAME='KISHOR'";
	private static final String GET_ALLSTUDENT="SELECT * FROM STUDENT1 ";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void createTableStudent() {
		jdbcTemplate.execute("DROP TABLE STUDENT1 ");
		jdbcTemplate.execute(CREATE_STUDENT_TABLE);
		System.out.println("table create");
	}

	@Override
	public void insertStudent() {
		
		jdbcTemplate.update(INSERT_STUDENT_TABLE);
		System.out.println("insert");
		//jdbcTemplate.queryForList(GET_STUDENT,Student.class);
		System.out.println(jdbcTemplate.queryForMap(GET_STUDENT));
		System.out.println(jdbcTemplate.queryForList(GET_ALLSTUDENT));
	}

}
