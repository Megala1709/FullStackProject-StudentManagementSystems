package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "student_table")
@DynamicUpdate

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "student_name", nullable = false)
	
	private String studentName;
	
	private int standard;
	private String dob;
	private String parentName;
	private String parentPhoneNo;
	private int stdAttendence;
	
	public Student() {}
	
	
	public Student(String studentName,  int id, int standard,String dob,String parentName,String parentPhoneNo,int stdAttendence) {
	
		this.studentName = studentName;

		this.standard=standard;
		this.dob=dob;
		this.parentName=parentName;
		this.parentPhoneNo=parentPhoneNo;
		this.stdAttendence=stdAttendence;
	}

	public int getid()
	{ 
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName =studentName;
	}
	
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob =dob;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName =parentName;
	}
	public String getParentPhoneNo() {
		return parentPhoneNo;
	}
	public void setParentPhoneNo(String parentPhoneNo) {
		this.parentPhoneNo =parentPhoneNo;
	}
	public int getStdAttendence() {
		return stdAttendence;
	}
	public void setStdAttendence(int stdAttendence) {
		this.stdAttendence =stdAttendence;
	}




	
}
