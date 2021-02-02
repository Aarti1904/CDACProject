package com.app.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@SuppressWarnings("serial")
@Entity
@Table(name="adminfaculty")
public class AdminFaculty implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Integer facultyid;

	@Column(name="firstname", length=30)
	private String firstname;


	@Column(name="lastname", length=30)
	private String lastname;


	public Integer getFacultyid() {
		return facultyid;
	}


	public void setFacultyid(Integer facultyid) {
		this.facultyid = facultyid;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "AdminFaculty [facultyid=" + facultyid + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}



}
