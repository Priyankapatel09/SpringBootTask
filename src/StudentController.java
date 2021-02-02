package com.springtooldemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springtooldemo.exception.ResourceNotFoundException;
import com.springtooldemo.model.Student;
import com.springtooldemo.service.StudentService;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

	@Autowired
	private StudentService studentservice;

	// create get all student
	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return studentservice.getAllStudent();
	}

	// create student
	@PostMapping("/students")
	public Student createStudent(@Validated @RequestBody Student student) {
		return studentservice.createStudent(student);
	}

	// create get student by id
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") long studentId)
			throws ResourceNotFoundException {
		return studentservice.getStudentById(studentId);
	}

	// update student
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable(value = "id") long studentId,
			@RequestBody Student studentDetails) throws ResourceNotFoundException {
		return studentservice.updateStudent(studentId, studentDetails);
	}

	// delete student
	@DeleteMapping("/students/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable(value = "id") long studentId)
			throws ResourceNotFoundException {
		return studentservice.deleteStudent(studentId);
	}

}
