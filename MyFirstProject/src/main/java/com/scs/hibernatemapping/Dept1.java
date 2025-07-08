package com.scs.hibernatemapping;
import java.util.Set;
import javax.persistence.*;
@Entity
@Table(name="dept")
public class Dept1 {
	@Id	
	private int deptid;
	@Column
	private String deptname;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
}
