package com.studentdemo.StudentManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "student")
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long rollnumber;
	private String name;
	private String course;
	private String stream;
	private double marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public long getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(long rollnumber) {
		this.rollnumber = rollnumber;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "StudentModel [rollnumber=" + rollnumber + ", name=" + name + ", course=" + course + ", stream=" + stream
				+ ", marks=" + marks + "]";
	}
}
