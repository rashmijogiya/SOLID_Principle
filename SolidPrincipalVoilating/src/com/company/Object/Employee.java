package com.company.Object;

public class Employee {

    private int empId;
    private String empName;
//    If a new requirement comes to calculate bonus on basis of employee type, then we need to change the method which
    private String empType;

    public Employee(){

    }

    public Employee(int empId, String empName, String empType){
        this.empId=empId;
        this.empName=empName;
        this.empType=empType;
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

    public int calculateBonus(int salary){
        int v;
        if(this.empType == "Permanent"){
           v  = salary * 10 /100;
        }else if(this.empType== "Temp"){
            v  = salary * 5 /100;
        }else{  // need to make changes in method to introduce new employee type which violates Open closed principle
            v=0;
        }
        return v;
    }

    public void getMinimumSalary(){
//        We will have to write logic based on employee type and
//        if any employee type increases then every time we need to make changes in method
//        which violates the rule of Liskov Substitution principle
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empType='" + empType + '\'' +
                '}';
    }
}
