/*
 * package com.ajay.springboot.learnjpaandhibernate.course.jparepository;
 * 
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.stereotype.Component;
 * 
 * import com.ajay.springboot.learnjpaandhibernate.course.Course;
 * 
 * 
 * @Component public class CourseJpaCommandLineRunner implements
 * CommandLineRunner {
 * 
 * @Autowired private CourseJpaRepository repository;
 * 
 * @Override public void run(String... args) throws Exception {
 * 
 * repository.insert(new Course(1, "Learn Computer Science Fundamentals",
 * "Ajay Deshpande")); repository.insert(new Course(2,
 * "Learn UNIX System Design", "Ajay Deshpande")); repository.insert(new
 * Course(3, "Learn LINUX Kernel", "Ajay Deshpande")); repository.insert(new
 * Course(4, "Learn Windows OS", "Ajay Deshpande"));
 * 
 * repository.deleteById(3);
 * 
 * System.out.println(repository.findById(2));
 * System.out.println(repository.findById(4));
 * 
 * }
 * 
 * }
 * 
 */