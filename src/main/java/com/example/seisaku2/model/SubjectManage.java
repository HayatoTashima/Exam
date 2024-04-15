package com.example.seisaku2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="SUBJECT")
public class SubjectManage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(length = 3, nullable = false)
	private String schoolcd;
	
	@Column(length = 3, nullable = false)
	private String subjectcd;
	
	@Column(length = 20, nullable = true)
	private String subjectname;
	
	
	public String getschoolcd() {
		return schoolcd;
	}
	public void setschoolcd(String schoolcd) {
		this.schoolcd = schoolcd;
	}
	
	public String getsubjectcd() {
		return subjectcd;
	}
	
	public void setsubjectcd(String subjectcd) {
		this.subjectcd = subjectcd;
	}
	
	public String getsubjectname() {
		return subjectname;
	}
	
	public void setsubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	
	
}
