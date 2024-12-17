package com.tesluko.spring_data_jpa_ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tesluko.spring_data_jpa_ex.model.Student;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);
		
		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);


		// s1.setRollNo(101);
		// s1.setName("Navin");
		// s1.setMarks(75);

		s2.setRollNo(102);
		s2.setName("Kiran");
		s2.setMarks(80);

		s3.setRollNo(103);
		s3.setName("Harsh");
		s3.setMarks(70);


		// repo.save(s2);
		// repo.save(s3);
		// System.out.println(repo.findById(103));

		repo.delete(s2);
	}

}
