package com.sample.demo1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sample.demo1.mappers.EmployeeMapper;
import com.sample.demo1.service.HRService;
import com.sample.demo1.vo.Employee;

public class MybatisSpringApp {

	public static void main(String[] args) {
		
		//String resource = "classpath:/META-INF/spring/demo1-context.xml";
		//String resource = "classpath:/META-INF/spring/app-mapper-scanner-context.xml";
		String resource = "classpath:/META-INF/spring/app-mybatis-tag-context.xml";
		
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		// getbean안에는 반드시 인터페이스 타입의 클래스를 지정해야 한다 --> getBean(HRService.class)
		HRService service = context.getBean(HRService.class);
		List<Employee> employees = service.getAllEmployees();
		System.out.println("조회된 사원 수: " + employees.size());
		
	}
	
}
