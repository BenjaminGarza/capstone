package com.BenGarza.capstone.Services;

import com.BenGarza.capstone.Models.Course;
import com.BenGarza.capstone.Models.User;
import com.BenGarza.capstone.Repository.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getCourses(){
        //  User user = new User( "test@gmail.com", "Ben",  "password");
        // model.addAttribute("stu", user);

        return (List<Course>) List.of(
                new Course(
                        "How to Dance",
                        1.99,
                        "Really awesome course."
                )
        );
    }

    public void addNewCourse(Course course) {
        Optional<Course> courseOptional = courseRepository
                .findCourseByName(course.getName());
        if(courseOptional.isPresent()) {
            throw new IllegalStateException("Course name is already in use");
        }
        courseRepository.save(course);
    }

    public void deleteCourse(Long courseId) {
        boolean exists = courseRepository.existsById(courseId);
        if (!exists){
            throw new IllegalStateException("Course does not exist. Id:" + courseId);
        }

        courseRepository.deleteById(courseId);

    }
@Transactional
    public void updateCourse(Long courseId, String name, String description, Double price) {
    Course course = courseRepository.findById(courseId).orElseThrow(() -> new IllegalStateException(
            "Course with id" + courseId + "does not exist."
    ));
    if (name != null &&
            name.length() > 0 &&
            !Objects.equals(course.getName(), name)){
        course.setName(name);
    }
    if (description != null &&
            description.length() > 0 &&
            !Objects.equals(course.getDescription(), description)){
        course.setDescription(description);
    }
    if (price != null &&
            price >= 0 &&
            !Objects.equals(course.getPrice(), price)){
        course.setPrice(price);
    }
    }
}
