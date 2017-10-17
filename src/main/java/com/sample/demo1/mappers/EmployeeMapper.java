package com.sample.demo1.mappers;

import java.util.List;

import com.sample.demo1.vo.Employee;

// mapper interface
// 내가 하고 싶은 작업을 작성하는 곳
public interface EmployeeMapper {

	// employee.xml파일의 select id의 이름(여기서는 getAllEmployees)과 이름이 반드시 동일해야 한다
	// employee.xml파일의 resultType이름과 <Employee>이름이 반드시 동일해야 한다
	List<Employee> getAllEmployees();
	
}
