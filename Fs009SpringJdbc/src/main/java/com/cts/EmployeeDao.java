package com.cts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	
	public void insertEmployeSimply(Employee employee) {
		
		   String sql="insert into employee values(?,?,?)";
	
		jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getSalary());
			
		
	}
	
	
	public List<Employee> showAllEmp(){
		
		String sql="select * from employee";
		
		RowMapper<Integer> r;
		
		List<Employee> list=jdbcTemplate.query(sql,(rs,rowNum)-> {
			
				Employee emp=new Employee();
				
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getInt("salary"));
				
				return emp;
			
			
		});
		
		return list;
		
	}
	
	
	
}
