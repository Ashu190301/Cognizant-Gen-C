package com.cts.ems.employeemanagementsystem.model;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String dob;
	private String city;
	private String country;
	private int pin;
	private long mobile;
	
	public Employee() {
		
	}

	public Employee(String firstName, String lastName, String gender, String dob, String city, String country,
			int pin, long mobile) {
	
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.city = city;
		this.country = country;
		this.pin = pin;
		this.mobile = mobile;
	}

	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", dob=" + dob
				+ ", city=" + city + ", country=" + country + ", pin=" + pin + ", mobile=" + mobile + "]";
	}

	

}
