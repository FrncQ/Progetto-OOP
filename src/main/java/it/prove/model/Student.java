package it.prove.model;

import java.time.LocalDate;

public class Student {
	
	private Integer id;
	private String name;
	private String email;
	private LocalDate dob; //data di nascita
	private Integer age;

	public Student() {
		super();
	}
	
	public Student(Integer id, String name, String email, LocalDate dob, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}
	
	public Student(String name, String email, LocalDate dob, Integer age) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [" + (id != null ? "id=" + id + ", " : "") + (name != null ? "name=" + name + ", " : "")
				+ (email != null ? "email=" + email + ", " : "") + (dob != null ? "dob=" + dob + ", " : "")
				+ (age != null ? "age=" + age : "") + "]";
	}
}
