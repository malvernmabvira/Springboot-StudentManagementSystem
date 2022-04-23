package com.luve.sms.service;

import java.util.List;

import com.luve.sms.model.Students;

public interface StudentsService {
	
	List<Students> getStudents();
	Students addStud(Students stud);

}
