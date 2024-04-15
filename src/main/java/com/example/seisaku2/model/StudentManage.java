package com.example.seisaku2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="STUDENT")
public class StudentManage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(length = 10, nullable = false)
	private String studentno;
	
	@Column(length = 10, nullable = true)
	private String studentname;
	
	@Column(length = 10, nullable = true)
	private String entyear;
	
	@Column(length = 3, nullable = true)
	private String classnum;
	
	@Column( nullable = true)
	private String isattend;
	
	@Column(length = 3, nullable = true)
	private String schoolcd;
	
	
	public String getstudentno() {
		return studentno;
	}
	
	public void setstudentno(String studentno) {
		this.studentno = studentno;
	}
	
	public String getstudentname() {
		return studentname;
	}
	
	public void setstudentname(String studentname) {
		this.studentname = studentname;
	}
	
	public String getentyear() {
		return entyear;
	}
	
	public void setentyear(String entyear) {
		this.entyear = entyear;
	}
	
	public String getclassnum() {
		return classnum;
	}
	
	public void setclassnum(String classnum) {
		this.classnum = classnum;
	}
	
	public String getisattend() {
		return isattend;
	}
	public void setisattend(String isattend) {
		this.isattend = isattend;
	}
	
	public String getschoolcd() {
		return schoolcd;
	}
	public void setschoolcd(String schoolcd) {
		this.schoolcd = schoolcd;
	}
}
