package com.ajay.springboot.learnjpaandhibernate.course.jparepository;

import org.springframework.stereotype.Repository;

import com.ajay.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course); // only one line to insert into table
	}
	
	public Course findById(long id) {
		
		return entityManager.find(Course.class, id); // Only one line for select query using id
	}
	
	public void deleteById(long id) {
		
		Course course = entityManager.find(Course.class, id); 
		entityManager.remove(course);           //To delete the row using id
		
	}

}
