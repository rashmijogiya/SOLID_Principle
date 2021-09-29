package com.company.InterfaceImpl;

import com.company.Interface.GeneralUser;
import com.company.Interface.SpecialUser;

public class SpecialUserImpl implements GeneralUser, SpecialUser {
    @Override
    public boolean login(String username, String password) {
        if (username.equalsIgnoreCase("Rashmi") && password.equals("pass")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean register(String username, String password, String emailId) {
        return true;
    }


    @Override
    public void createUser() {
        System.out.println("Since user is special user it can create users");
    }
}
