package com.company;

import com.company.InterfaceImpl.ActionsByUserImpl;
import com.company.InterfaceImpl.UserImpl;
import com.company.Object.Employee;

public class Main {

    public static void main(String[] args) {
        // write your code here
        UserImpl userImpl = new UserImpl();
        boolean result = false;
        result = userImpl.login("Rashmi1", "pass");
        ActionsByUserImpl action = new ActionsByUserImpl();
        System.out.println(result);
        if (result) {
            if (action.checkOtherUsersList().equals("Success")) {
                Employee empRashmi = new Employee(1, "Rashmi", "Permanent");
                Employee empDaksh = new Employee(2, "Daksh", "Temp");
                Employee empJohn = new Employee(3, "John", "other");
                System.out.println(" employee 1== " + empRashmi);
                System.out.println(" employee 2== " + empDaksh);
                empRashmi.calculateBonus(50000);
                System.out.println("Bonus: " + empRashmi.calculateBonus(50000));
                empDaksh.calculateBonus(10000);
                System.out.println(" Bonus: " + empDaksh.calculateBonus(10000));
                empJohn.calculateBonus(20000);
            } else {
                System.out.println("Cant calculate bonus as user dont have access to check other user list ");
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

