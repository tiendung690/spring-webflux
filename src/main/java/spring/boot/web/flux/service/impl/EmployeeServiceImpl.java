package spring.boot.web.flux.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.boot.web.flux.dao.EmployeeRepository;
import spring.boot.web.flux.model.data.Employee;
import spring.boot.web.flux.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findEmployeeByDeptid(Integer deptid) {
		return employeeRepository.findByDeptid(deptid);
	}

	@Override
	public List<Employee> findEmployeeByFirstname(String firstname) {
		return employeeRepository.findByFirstname(firstname);
	}

	@Override
	public List<Employee> findEmployeeByLastname(String lastname) {
		return employeeRepository.findByLastname(lastname);
	}

	@Override
	public List<Employee> findEmployeeByAge(Integer age) {
		return employeeRepository.findByAge(age);
	}

	@Override
	public List<Employee> findAllEmps() {
		
		return employeeRepository.findAll();
	}
}