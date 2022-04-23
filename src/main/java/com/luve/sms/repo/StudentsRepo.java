package com.luve.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luve.sms.model.Students;

public interface StudentsRepo extends JpaRepository<Students,Long> {

}
