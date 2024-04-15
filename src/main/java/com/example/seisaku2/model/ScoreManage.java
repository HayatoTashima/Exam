package com.example.seisaku2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Test")
public class ScoreManage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(length = 10, nullable = false)
	private String studentno;
	
	@Column(length = 10, nullable = true)
	private String subjectcd;
	
	@Column(length = 10, nullable = true)
	private String schoolcd;
	
	@Column(length = 3, nullable = true)
	private String no;
	
	@Column( nullable = true)
	private String point;
	
	@Column(length = 3, nullable = true)
	private String classnum;
	
	
	public String getstudentno() {
		return studentno;
	}
	
	public void setstudentno(String studentno) {
		this.studentno = studentno;
	}
	
	public String getsubjectcd() {
		return subjectcd;
	}
	
	public void setsubjectcd(String subjectcd) {
		this.subjectcd = subjectcd;
	}
	
	public String getschoolcd() {
		return schoolcd;
	}
	public void setschoolcd(String schoolcd) {
		this.schoolcd = schoolcd;
	}
	
	public String getno() {
		return no;
	}
	
	public void setno(String no) {
		this.no = no;
	}
	
	public String getpoint() {
		return point;
	}
	public void setpoint(String point) {
		this.point = point;
	}
	
	public String getclassnum() {
		return classnum;
	}
	public void setclassnum(String classnum) {
		this.classnum = classnum;
	}
}