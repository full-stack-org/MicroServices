package com.springboot.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.department.entity.Department;
import com.springboot.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department/v1")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside Save Department of DepartmentController");
		return departmentService.saveDepartment(department);
	}

	@GetMapping("/getAllDepartMentDetails")
	public List<Department> getAllDepartMentDetails() {
		log.info("Inside Get All Department Details of DepartmentController");
		return departmentService.getAllDepatmentDetails();
	}

	@GetMapping("/findDepartmentById/{departmentId}")
	public Department findDepartmentById(@PathVariable Long departmentId) {
		log.info("Inside Find Department By Id of DepartmentController");
		return departmentService.findDepartMentById(departmentId);
	}

}
