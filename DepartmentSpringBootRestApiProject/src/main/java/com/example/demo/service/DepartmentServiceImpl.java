package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	DepartmentRepository departmentrepo;

	//insert
	@Override
	public Department saveDepartment(Department department) {
		return departmentrepo.save(department);
	}

	//get Record
	@Override
	public List<Department> fetchDepartmentList() {
		return departmentrepo.findAll();
	}

	//Delete
	@Override
	public void deleteDepartmentById(Long did) {
		departmentrepo.deleteById(did);
	}

	//update
	@Override
	public Department updateDepartment(Long did, Department department) {
		Optional<Department> department1= departmentrepo.findById(did);
		Department depDB=null;
		if(department1.isPresent()) {
			depDB=	departmentrepo.findById(did).get();
			if(Objects.nonNull(department.getDeptName()) && !"".equalsIgnoreCase(department.getDeptName())) {
				depDB.setDeptName(department.getDeptName());

			}
			if(Objects.nonNull(department.getDeptAddress()) && !"".equalsIgnoreCase(department.getDeptAddress())) {
				depDB.setDeptAddress(department.getDeptAddress());
				System.out.println(department.getDeptAddress());
			}
			if(Objects.nonNull(department.getDeptCode()) && !"".equalsIgnoreCase(department.getDeptCode())) {
				depDB.setDeptCode(department.getDeptCode());
				System.out.println(department.getDeptCode());
			}

		}
		return departmentrepo.save(depDB);
	}
	
	/*
	@Override
	public Department fetchDepartmentById(Long did) {
		return departmentrepo.findById(did).get();
	}*/
	
	@Override
	public Department fetchDepartmentById(Long did) throws DepartmentNotFoundException {
		//check for null
		Optional<Department> department1= departmentrepo.findById(did);//check in database
          if(!department1.isPresent()) {
        	  throw new DepartmentNotFoundException("Department not available");
          }
		return departmentrepo.findById(did).get();
	}

	@Override
	public Department fetchDepartmentByName(String dname) {
		return departmentrepo.findBydeptName(dname);
	}

	@Override
	public Department fetchDepartmentByCode(String dcode) {
		return departmentrepo.findBydeptCode(dcode);
	}

	@Override
	public Department fetchDepartmentByAddress(String daddress) {
		return departmentrepo.findBydeptAddress(daddress);
	}
}

