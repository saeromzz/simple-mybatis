package com.sample.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo1.mappers.EmployeeMapper;
import com.sample.demo1.vo.Employee;

// @Service: 자동으로 빈 등록
@Service
public class HRServiceImpl implements HRService {
	
	// employeeMapper 주입하기
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeMapper.getAllEmployees();
		if (employees.isEmpty()) {
			throw new RuntimeException("조회결과가 존재하지 않습니다");
			
		}
		System.out.println("조회된 사원 수 유후~ 여기는 serviceImpl:" +employees.size());
		return employees;
	}
}
