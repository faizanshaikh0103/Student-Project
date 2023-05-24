package com.studentdemo.StudentManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdemo.StudentManagement.dao.StudentDao;
import com.studentdemo.StudentManagement.entity.StudentModel;

@Service
public class StudentService {

	@Autowired
	private StudentDao dao;
	
	public StudentModel getStudent(long rollnum) {
		return dao.getStudent(rollnum);
	}

	public String saveStudent(StudentModel s) {
		return dao.saveStudent(s);
	}

	public String updateStudent(StudentModel s) {
		return dao.updateStudent(s);
	}

	public String deleteStudent(long rollnum) {
		return dao.deleteStudent(rollnum);
	}
}
