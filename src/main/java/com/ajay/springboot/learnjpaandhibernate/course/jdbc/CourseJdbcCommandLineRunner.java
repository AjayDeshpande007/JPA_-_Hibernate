/*
 * package com.ajay.springboot.learnjpaandhibernate.course.jdbc;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.stereotype.Component;
 * 
 * import com.ajay.springboot.learnjpaandhibernate.course.Course;
 * 
 * 
 * @Component public class CourseJdbcCommandLineRunner implements
 * CommandLineRunner {
 * 
 * @Autowired private CourseJdbcRepository repository;
 * 
 * @Override public void run(String... args) throws Exception {
 * 
 * repository.insert(new Course(1, "Learn Computer Science Fundamentals",
 * "Ajay Deshpande")); repository.insert(new Course(2,
 * "Learn UNIX System Design", "Ajay Deshpande")); repository.insert(new
 * Course(3, "Learn LINUX Kernel", "Ajay Deshpande")); repository.insert(new
 * Course(4, "Learn Windows OS", "Ajay Deshpande"));
 * 
 * repository.deleteById(4);
 * 
 * System.out.println(repository.findById(2));
 * System.out.println(repository.findById(3));
 * 
 * }
 * 
 * }
 */