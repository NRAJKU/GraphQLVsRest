package com.example.controller;

import com.example.dto.request.CreateStudentRequest;
import com.example.entity.Student;
import com.example.service.StudentService;
import com.example.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private SubjectService subjectService;

    @GetMapping("hello")
    public String hello(){
        return "hello world!!";
    }

    @GetMapping("student/{studentId}")
    public Object getStudent(@PathVariable Long studentId){
        try{
            return studentService.getStudentById(studentId);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @GetMapping("student/{studentId}")
    public Object getStudent1(@PathVariable Long studentId){
        try{
            return studentService.getStudentById(studentId);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

//    @GetMapping("/student/{studentId}/learningSubject/subject/{subjectName}")
//    public ResponseEntity getStudentLearningSubjects(@PathVariable Long studentId, @PathVariable String subjectName){
//        return new ResponseEntity(subjectService.getLearningSubjects(studentService.getStudentById(studentId)))
//    }

    @PostMapping("student")
    public Object createStudent(@RequestBody CreateStudentRequest request){
        try {
            return studentService.createStudent(request);
        } catch(Exception e){
            return e.getMessage();
        }
    }
}
