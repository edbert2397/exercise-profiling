package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
//        List<Student> students = studentRepository.findAll();
//        List<StudentCourse> studentCourses = new ArrayList<>();
//        for (Student student : students) {
//            List<StudentCourse> studentCoursesByStudent = studentCourseRepository.findByStudentId(student.getId());
//            for (StudentCourse studentCourseByStudent : studentCoursesByStudent) {
//                StudentCourse studentCourse = new StudentCourse();
//                studentCourse.setStudent(student);
//                studentCourse.setCourse(studentCourseByStudent.getCourse());
//                studentCourses.add(studentCourse);
//            }
//        }
//        return studentCourses;
        return studentCourseRepository.findAll();
    }

    public Optional<Student> findStudentWithHighestGpa() {
        List<Sort.Order> sortList = new ArrayList<Sort.Order>();
        sortList.add(new Sort.Order(Sort.Direction.DESC, "gpa"));
        sortList.add(new Sort.Order(Sort.Direction.ASC, "name"));
        List<Student> students = studentRepository.findAll(Sort.by(sortList));
        Student highestGpaStudent = students.get(0);
        return Optional.ofNullable(highestGpaStudent);
    }

    public String joinStudentNames() {
        List<Student> students = studentRepository.findAll();
//        String result = "";
//        for (Student student : students) {
//            result += student.getName() + ", ";
//        }
//        return result.substring(0, result.length() - 2);
        StringBuilder result = new StringBuilder();
        String coma = ", ";
        for (Student student : students) {
            result.append(student.getName()).append(coma);
        }
        return result.substring(0, result.length() - 2);
    }
}

