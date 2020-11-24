package com.springboot.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.department.entity.Department;
import com.springboot.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside Save Department of DepartmentService");
		return departmentRepository.save(department);
	}

	public List<Department> getAllDepatmentDetails() {
		log.info("Inside Get All Department Details of DepartmentService");
		return departmentRepository.findAll();
	}

	public Department findDepartMentById(Long departmentId) {
		log.info("Inside Find Department By Id of DepartmentService");
		return departmentRepository.findById(departmentId).get();
	}
}
