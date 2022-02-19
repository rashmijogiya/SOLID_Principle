package com.company.InterfaceImpl;

import com.company.Interface.ActionsByUser;

public class ActionsByUserImpl implements ActionsByUser {

    @Override
    public String checkOtherUsersList() {
        System.out.println("Can check other users list");
        return "Success";
    }

    @Override
    public String createUser() {
        System.out.println("Can create user.");
//        save data to database
//        this.saveUser(username, password, emailId);
        return "Success";
    }

    public boolean saveUser(String username, String password, String email) {
        System.out.println(" User is saved in Database");
        return true;
    }
}
