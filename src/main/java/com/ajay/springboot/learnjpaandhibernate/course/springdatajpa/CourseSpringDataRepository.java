package com.ajay.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajay.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringDataRepository extends JpaRepository<Course, Long> {
	
	
	List<Course> findByAuthor(String author); // If we want any customize methods just declare in this interface like this one.

}
