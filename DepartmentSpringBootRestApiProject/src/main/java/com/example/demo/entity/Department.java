package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long deptId;
	private String deptName;
	private String deptCode;
	private String deptAddress;	
	
	public Department() {
		super();
	
	}

	public Department(long deptId, String deptName, String deptCode, String deptAddress) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptCode = deptCode;
		this.deptAddress = deptAddress;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptAddress() {
		return deptAddress;
	}

	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptCode=" + deptCode + ", deptAddress="
				+ deptAddress + "]";
	}

}
