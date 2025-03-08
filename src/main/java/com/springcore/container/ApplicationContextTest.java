package com.springcore.container;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springcore.model.Student;

public class ApplicationContextTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_bean.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student.getName());
	}

}
