package com.javatpoint.models;

public class Emp {

	private int emp_no;
	private String first_name;
	private String last_name;
	private String gender;
	private String hire_date;
	private String birth_date;

	public Emp() {};

	public Emp(int emp_no, String first_name, String last_name, String gender, String birth_date, String hire_date) {
		super();
		this.emp_no = emp_no;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.birth_date = birth_date;
		this.hire_date = hire_date;
	}

	public int getId() {
		return emp_no;
	}

	public void setId(int emp_no) {
		this.emp_no=emp_no;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String first_name) {
		this.first_name=first_name;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String last_name) {
		this.last_name=last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender=gender;
	}

	public String getHireDate() {
		return hire_date;
	}

	public void setHireDate(String hire_date) {
		this.hire_date=hire_date;
	}

	public String getBirthDate() {
		return birth_date;
	}

	public void setBirthDate(String birth_date) {
		this.birth_date=birth_date;
	}

}
