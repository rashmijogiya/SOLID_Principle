package com.company.Abstract;

public abstract class NewEmployee {

    private int id;
    private String empName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public abstract int getMinimumSalary();
}
