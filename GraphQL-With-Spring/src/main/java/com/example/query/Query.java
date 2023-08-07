package com.example.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.request.SampleRequest;
import com.example.response.StudentResponse;
import com.example.service.StudentService;

@Component
public class Query implements GraphQLQueryResolver {
	
	@Autowired
	StudentService studentService;

	public String firstQuery () {
		return "First Query";
	}
	
	public String secondQuery () {
		return "Second Query";
	}
	
	public String fullName (SampleRequest sampleRequest) {
		return sampleRequest.getFirstName() + " " + sampleRequest.getLastName();
	}
	
	public StudentResponse getStudent (long id) {
		return new StudentResponse(studentService.getStudentById(id));
	}
}
