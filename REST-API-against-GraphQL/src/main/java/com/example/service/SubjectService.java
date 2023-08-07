package com.example.service;

import com.example.dto.enums.SubjectNameFilter;
import com.example.dto.response.StudentResponse;
import com.example.dto.response.SubjectResponse;
import com.example.entity.Subject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

	public List<SubjectResponse> getLearningSubjects(StudentResponse studentResponse,
													 SubjectNameFilter subjectNameFilter) {
		List<SubjectResponse> learningSubjects = new ArrayList<SubjectResponse>();
		if (studentResponse.getStudent().getLearningSubjects() != null) {
			for (Subject subject : studentResponse.getStudent().getLearningSubjects()) {
				if (subjectNameFilter.name().equalsIgnoreCase("ALL")) {
					learningSubjects.add(new SubjectResponse(subject));
				} else if (subjectNameFilter.name().equalsIgnoreCase(subject.getSubjectName())) {
					learningSubjects.add(new SubjectResponse(subject));
				}
			}
		}
		return learningSubjects;
	}

	public String getFullName(StudentResponse studentResponse) {
		return studentResponse.getFirstName() + " " + studentResponse.getLastName();
	}
}
