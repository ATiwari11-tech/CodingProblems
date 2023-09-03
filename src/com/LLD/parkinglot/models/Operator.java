package com.LLD.parkinglot.models;

public class Operator extends BaseModel{
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int empId;
    private String name;
}
