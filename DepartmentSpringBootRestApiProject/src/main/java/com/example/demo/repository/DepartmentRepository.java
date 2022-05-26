package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	//by Name
	public Department findBydeptName(String dname);

	//by Code
	public Department findBydeptCode(String dcode);

	//by Address
	public Department findBydeptAddress(String daddress);

}
