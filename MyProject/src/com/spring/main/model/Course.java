package com.spring.main.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Course {

	private int id;
	private String name;
	private int credit;
	@Autowired
	private Department department;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String name, int credit, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.credit = credit;
		this.department = department;
		

	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", credit=" + credit + ", department=" + department + "]";
	}

}
