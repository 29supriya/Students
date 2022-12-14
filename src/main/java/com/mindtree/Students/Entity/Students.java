package com.mindtree.Students.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Students {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int rollNo;
	private String sname;
	private String gender;
	private int age;
	private int clgId;
	public Students() {
		super();
		
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getClgId() {
		return clgId;
	}
	public void setClgId(int clgId) {
		this.clgId = clgId;
	}
	public Students( String sname, String gender, int age, int clgId) {
		super();
		
		this.sname = sname;
		this.gender = gender;
		this.age = age;
		this.clgId = clgId;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sname=" + sname + ", gender=" + gender + ", age=" + age + ", clgId="
				+ clgId + "]";
	}
	}





