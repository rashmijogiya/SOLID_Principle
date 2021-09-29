package com.company;

import com.company.Abstract.Employee;
import com.company.Abstract.NewEmployee;
import com.company.InterfaceImpl.GeneralUserImpl;
import com.company.Objects.ContractEmployee;
import com.company.Objects.PermanentEmployee;
import com.company.Objects.TempEmployee;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Check if user is present
        GeneralUserImpl userImpl = new GeneralUserImpl();
        boolean result = false;
        result = userImpl.login("Rashmi1", "pass");
        System.out.println( result );
        if (result) {
            List<Employee> emplList = new LinkedList<Employee>();
            emplList.add(new PermanentEmployee(1, "Rashmi"));
            emplList.add(new TempEmployee(2, "Daksh"));

            for (Employee e : emplList) {
                e.calculateBonus(50000);
                System.out.println("Bonus: " + e.calculateBonus(50000));
                e.calculateBonus(10000);
                System.out.println(" Bonus: " + e.calculateBonus(10000));
            }

            List<NewEmployee> newEmpList = new LinkedList<NewEmployee>();
            newEmpList.add(new ContractEmployee(3, "John"));
            newEmpList.add(new PermanentEmployee(1, "Rashmi"));
            newEmpList.add(new TempEmployee(2, "Daksh"));
            for (NewEmployee ne : newEmpList) {
                ne.getMinimumSalary();
            }
        } else {
            result = userImpl.register("Jogiya", "pass", "rashmi.jogiya@zemosolabs.com");
            if (result) {
                System.out.println(" User is registered ");
            } else {
                System.out.println(" User not registered");
            }
        }
    }
}
