package com.studentdemo.StudentManagement.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentdemo.StudentManagement.entity.StudentModel;

@Repository
public class StudentDao {

	@Autowired
	private SessionFactory sf;
	@Autowired
	private StudentModel sm;
	
	public StudentModel getStudent(long rollnum) {
		Session session =sf.openSession();
		return session.get(StudentModel.class, rollnum);
	}

	public String saveStudent(StudentModel s) {
		Session session = sf.openSession();
	    Transaction tr = session.beginTransaction();
	    session.save(s);
	    tr.commit();
		return "Student Saved";
	}

	public String updateStudent(StudentModel s) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		sm =session.get(StudentModel.class, s.getRollnumber());
		sm.setCourse(s.getCourse());
		sm.setMarks(s.getMarks());
		sm.setName(s.getName());
		sm.setStream(s.getStream());
		session.update(sm);
		tr.commit();
		return "Update success";
	}

	public String deleteStudent(long rollnum) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		sm = session.get(StudentModel.class, rollnum);
		session.delete(sm);
		tr.commit();
		return "Delete Success";
	}
}
