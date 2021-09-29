package com.company.InterfaceImpl;

import com.company.Interface.User;

public class UserImpl implements User {


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
        this.saveUser(username, password, emailId);
        return true;
    }

    @Override
    public boolean sendEmail(String email) {
        return false;
    }

    @Override
    public void logError(String error) {

    }

    public boolean saveUser(String username, String password, String email) {
        System.out.println(" User is saved in Database");
        return true;
    }

}
