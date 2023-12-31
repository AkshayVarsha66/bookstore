package com.student.controller;

import java.util.List;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
public class Controller {

	
	private StudentService studentService;
	
	@PostMapping("addstudent")
	public Student addStudent(@RequestBody Student student){
		return studentService.addstudent(student);
	}
	@GetMapping("allstudent")
	public List<Student> allstudents(){
		return studentService.allstudent();
	}
	
}
