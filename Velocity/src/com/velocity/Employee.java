package com.velocity;

import java.util.Date;
/**
 * 
 * Method names  in this class should not be changed as these are used in velocity templates defined in Templates.class
 *
 */
public class Employee {

	private String name;
	private int age;
	private char sex;
	private Date dob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
