package com.BenGarza.capstone.Repository;

import com.BenGarza.capstone.Models.Course;
import com.BenGarza.capstone.Models.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository
        extends JpaRepository<Course, Long> {
}
