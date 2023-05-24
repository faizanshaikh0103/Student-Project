package com.studentdemo.StudentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentdemo.StudentManagement.entity.StudentModel;
import com.studentdemo.StudentManagement.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/getbyrollnum/{rollnum}")
	public StudentModel getStudent(@PathVariable long rollnum) {
		return service.getStudent(rollnum);
	}
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody StudentModel s) {
		return service.saveStudent(s);
	}
	
	@PutMapping("/update/{rollnum}")
	public String updateStudent(@PathVariable long rollnum, @RequestBody StudentModel s) {
		s.setRollnumber(rollnum);
		return service.updateStudent(s);
	}
	
	@DeleteMapping("/delete/{rollnum}")
	public String deleteStudent(@PathVariable long rollnum) {
		return service.deleteStudent(rollnum);
	}
}
