package com.example.day4post.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String employeename;
    private String email;
    private String password;
    private String phone;
    private String empid;
    private int batch;
    private String roles;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmployeename() {
        return employeename;
    }
    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmpid() {
        return empid;
    }
    public void setEmpid(String empid) {
        this.empid = empid;
    }
    public int getBatch() {
        return batch;
    }
    public void setBatch(int batch) {
        this.batch = batch;
    }
    public String getRoles() {
        return roles;
    }
    public void setRoles(String roles) {
        this.roles = roles;
    }
    public User(int id, String employeename, String email, String password, String phone, String empid, int batch,
            String roles) {
        this.id = id;
        this.employeename = employeename;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.empid = empid;
        this.batch = batch;
        this.roles = roles;
    }
    
    }
