package com.skr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.skr.config.AppConfig;
import com.skr.dao.IStudentDAO;
import com.skr.dao.impl.StudentDaoImpl;

public class JdbcTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		IStudentDAO dao=context.getBean("studentDaoImpl",StudentDaoImpl.class);
		dao.createTableStudent();
		dao.insertStudent();
	}

}
