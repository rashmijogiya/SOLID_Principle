package com.company.Objects;

import com.company.Abstract.NewEmployee;

public class ContractEmployee extends NewEmployee {

    public ContractEmployee(){

    }
    public ContractEmployee(int id, String empName){
    }


    @Override
    public int getMinimumSalary() {
        return 1000;
    }
}
