package it.prove.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import it.prove.model.Student;

@Service
public class StudentService {
	
	Student s = new Student( 1,"Anna","fake.email@mail.com", LocalDate.of(2001, 10, 10),20);

	public List<Student> getStudent(){
		return List.of(s);
	}
	
	public String toString() {
		return s.toString();
	}


}
  