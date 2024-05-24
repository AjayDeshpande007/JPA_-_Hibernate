package com.ajay.springboot.learnjpaandhibernate.course.springdatajpa;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ajay.springboot.learnjpaandhibernate.course.Course;


@Component
public class CourseSpringDataCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseSpringDataRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1, "Learn Computer Science Fundamentals", "Ajay Deshpande"));
		repository.save(new Course(2, "Learn UNIX System Design", "Ajay Deshpande"));
		repository.save(new Course(3, "Learn LINUX Kernel", "Ajay Deshpande"));
		repository.save(new Course(4, "Learn Windows OS", "Ajay Deshpande"));
		repository.save(new Course(5, "Learn Kali Linux OS", "Mrunal Pathak"));
		
		repository.deleteById(3l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(4l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Mrunal Pathak"));
		
	}

}

