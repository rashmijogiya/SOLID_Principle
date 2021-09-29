package com.company.Objects;
import com.company.Abstract.Employee;
public class PermanentEmployee extends Employee {

public PermanentEmployee(){

}
public PermanentEmployee(int id, String empName){

}
    @Override
    public int calculateBonus(int salary) {
        int v;
            v  = salary * 10 /100;
        return v;
    }


    @Override
    public int getMinimumSalary() {
        return 25000;
    }
}
