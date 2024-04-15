package com.example.seisaku2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="TEACHER")
public class TeacherManage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(length = 10, nullable = false)
	private String id;
	
	@Column(length = 30, nullable = true)
	private String password;
	
	@Column(length = 10, nullable = true)
	private String name;
	
	@Column(length = 3, nullable = true)
	private String school_cd;
	
	
	
	public String getid() {
		return id;
	}
	
	public void setid(String id) {
		this.id = id;
	}
	
	public String getpassword() {
		return password;
	}
	
	public void setpassword(String password) {
		this.password = password;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public String getschool_cd() {
		return school_cd;
	}
	
	public void setschool_cd(String school_cd) {
		this.school_cd = school_cd;
	}
	
}