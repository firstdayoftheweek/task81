package com.example.manytomany.repository;

import com.example.manytomany.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository  extends JpaRepository<Courses,Long> {
}