package com.luve.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luve.sms.model.Students;
import com.luve.sms.repo.StudentsRepo;

@Service
public class StudentsServiceImp implements StudentsService {
	
	private StudentsRepo repo;

	public StudentsServiceImp(StudentsRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Students> getStudents() {
	
		return repo.findAll();
	}

}
