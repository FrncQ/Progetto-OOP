package it.prove.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.prove.model.Student;
import it.prove.service.StudentService;


@RestController
public class Controller {
	
	@Autowired
	private final StudentService ser_student = new StudentService();
	
	
	@GetMapping(value = "/hello")
	public String hello() {
		return ("Hello World");
	}
	
	@GetMapping(value = "/student")
	public List<Student> student(){
		return ser_student.getStudent();
		}
	
	@GetMapping(value = "/list")
	public String list() {
		return ser_student.toString();
	}
}
