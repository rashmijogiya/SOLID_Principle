package com.company.Objects;
import com.company.Abstract.Employee;
public class TempEmployee extends Employee {

    public TempEmployee(){

    }

    public TempEmployee(int id, String empName){

    }

    @Override
    public int calculateBonus(int salary) {
        int v;
        v  = salary * 5 /100;
        return v;
    }

    @Override
    public int getMinimumSalary() {
        return 15000;
    }
}
