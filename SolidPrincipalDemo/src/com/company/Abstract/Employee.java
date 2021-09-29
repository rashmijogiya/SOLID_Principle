package com.company.Abstract;

import com.company.Interface.EmployeeBonus;

public abstract class Employee extends NewEmployee implements EmployeeBonus {
    private int empId;
    private String empName;
//    If a new requirement comes to calculate bonus on basis of employee type, then we need to change the method
//    private String empType;

    public Employee(){

    }
    public Employee(int empId, String empName){
        this.empId=empId;
        this.empName=empName;
    }
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public abstract int calculateBonus(int salary);

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
