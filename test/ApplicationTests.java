package com.springtooldemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.springtooldemo.model.Student;
import com.springtooldemo.repository.StudentRepository;
import com.springtooldemo.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {
	@Autowired
	private StudentService studentservice;
	@MockBean
	private StudentRepository studentrepository;

	@Test
	public void getAllStudentTest() {
		when(studentrepository.findAll())
				.thenReturn(Stream.of(new Student(1, "Hasmita", "Patel", "Nerul")).collect(Collectors.toList()));
		assertEquals(1,studentservice.getAllStudent().size());
	}
}
