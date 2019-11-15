package spring.boot.web.flux.dao;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.boot.web.flux.model.data.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Cacheable("employeeCache")
	List<Employee> findByDeptid(Integer deptid);
	
	@Cacheable("employeeCache")
	List<Employee> findByFirstname(String firstname);
	
	@Cacheable("employeeCache")
	List<Employee> findByLastname(String lastname);
	
	@Cacheable("employeeCache")
	List<Employee> findByAge(Integer age);
	
}