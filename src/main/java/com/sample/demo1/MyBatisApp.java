package com.sample.demo1;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sample.demo1.mappers.EmployeeMapper;
import com.sample.demo1.vo.Employee;

public class MyBatisApp {

public static void main(String[] args) throws Exception {
		
		String resource = "classpath:/mybatis/mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		
		// sqlSession은 1회용
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
			List<Employee> employees = mapper.getAllEmployees();
			System.out.println("조회된 회원수: " + employees.size());
			
		} finally {
			sqlSession.close();
		}
	}
}
