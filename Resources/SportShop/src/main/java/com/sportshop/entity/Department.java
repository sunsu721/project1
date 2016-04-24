package com.sportshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
 
@Entity
@Table(name = "DEPARTMENT", uniqueConstraints = { @UniqueConstraint(columnNames = { "DEPT_NO" }) })
public class Department {
 
   private Integer deptId;
   private String deptNo;
 
   private String deptName;
   private String location;
 
   public Department() {
   }
 
   public Department(Integer deptId, String deptName, String location) {
       this.deptId = deptId;
       this.deptNo = "D" + this.deptId;
       this.deptName = deptName;
       this.location = location;
   }
 
   @Id
   @Column(name = "DEPT_ID")
   public Integer getDeptId() {
       return deptId;
   }
 
   public void setDeptId(Integer deptId) {
       this.deptId = deptId;
   }
 
   @Column(name = "DEPT_NO", length = 20, nullable = false)
   public String getDeptNo() {
       return deptNo;
   }
 
   public void setDeptNo(String deptNo) {
       this.deptNo = deptNo;
   }
 
   @Column(name = "DEPT_NAME", nullable = false)
   public String getDeptName() {
       return deptName;
   }
 
   public void setDeptName(String deptName) {
       this.deptName = deptName;
   }
 
   @Column(name = "LOCATION")
   public String getLocation() {
       return location;
   }
 
   public void setLocation(String location) {
       this.location = location;
   }
 
}