package com.springboot.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.user.entity.User;
import com.springboot.user.repository.UserRepository;
import com.springboot.user.vo.Department;
import com.springboot.user.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside Save User of UserService");
		return userRepository.save(user);
	}

	public List<User> getAllUsersDetails() {
		log.info("Inside Get All Users Details of UserService");
		return userRepository.findAll();
	}

	public User findUserById(Long userId) {
		log.info("Inside Find User By Id of UserService");
		return userRepository.findById(userId).get();
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		log.info("InsideGet User With Department By Id of UserService");
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
		User user = userRepository.findById(userId).get();

		Department department = restTemplate.getForObject(
				"http://DEPARTMENT-SERVICE/department/v1/findDepartmentById/" + user.getDepartmentId(), Department.class);

		responseTemplateVO.setUser(user);
		responseTemplateVO.setDepartment(department);

		return responseTemplateVO;
	}
}
