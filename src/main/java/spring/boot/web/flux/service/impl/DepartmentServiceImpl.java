package spring.boot.web.flux.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.boot.web.flux.dao.DepartmentRepository;
import spring.boot.web.flux.model.data.Department;
import spring.boot.web.flux.service.DepartmentService;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepts() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

}