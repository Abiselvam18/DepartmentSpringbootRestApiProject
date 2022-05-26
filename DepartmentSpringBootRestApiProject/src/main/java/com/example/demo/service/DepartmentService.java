package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;

public interface DepartmentService {
	//Insert
	Department saveDepartment(Department department);

	//get Record
	List<Department> fetchDepartmentList();

	//Delete Record
	void deleteDepartmentById(Long did);

	//update Record
	Department updateDepartment(Long did, Department department);

	//findbyId
	Department fetchDepartmentById(Long did) throws DepartmentNotFoundException;

	//findbyName
	Department fetchDepartmentByName(String dname);

	//findbyCode
	Department fetchDepartmentByCode(String dcode);

	//findbyAddress
	Department fetchDepartmentByAddress(String daddress);

}
