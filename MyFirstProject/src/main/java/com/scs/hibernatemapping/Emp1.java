package com.scs.hibernatemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Emp1 {

    @Id
    private int empid;

    @Column(name = "empname")
    private String empname;

    @ManyToOne
    @JoinColumn(name = "deptid", referencedColumnName = "deptid")
    private Dept1 dept;

    // Getters and Setters

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

    public Dept1 getDept() {
        return dept;
    }

    public void setDept(Dept1 dept) {
        this.dept = dept;
    }
}
