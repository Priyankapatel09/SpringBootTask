package com.springtooldemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.springtooldemo.exception.ResourceNotFoundException;
import com.springtooldemo.model.Student;
import com.springtooldemo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentrepository;

	public Student createStudent(@Validated @RequestBody Student student) {
		return studentrepository.save(student);
	}

	public List<Student> getAllStudent() {
		return studentrepository.findAll();
	}

	public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") long studentId)
			throws ResourceNotFoundException {
		Student student = studentrepository.findById(studentId)
				.orElseThrow(() -> new ResourceNotFoundException("This id doesnot exists : " + studentId));
		return ResponseEntity.ok().body(student);
	}

	public ResponseEntity<Student> updateStudent(@PathVariable(value = "id") long studentId,
			@RequestBody Student studentDetails) throws ResourceNotFoundException {
		Student student = studentrepository.findById(studentId)
				.orElseThrow(() -> new ResourceNotFoundException("This id doesnot exists : " + studentId));
		student.setFirstName(studentDetails.getFirstName());
		student.setLastName(studentDetails.getLastName());
		student.setAddress(studentDetails.getAddress());
		studentrepository.save(student);
		return ResponseEntity.ok().body(student);
	}

	// delete student
	public ResponseEntity<?> deleteStudent(@PathVariable(value = "id") long studentId)
			throws ResourceNotFoundException {
		studentrepository.findById(studentId)
				.orElseThrow(() -> new ResourceNotFoundException("This id doesnot exists ::" + studentId));
		studentrepository.deleteById(studentId);
		return ResponseEntity.ok().build();
	}

}
