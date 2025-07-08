package com.scs.hibernatemapping;

import javax.persistence.*;

@Entity
@Table(name="tbl_emp")
public class Emp {
	@Id	
	private int empid;
	@Column
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}
