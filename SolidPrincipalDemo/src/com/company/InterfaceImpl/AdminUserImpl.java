package com.company.InterfaceImpl;

import com.company.Interface.AdminUser;
import com.company.Interface.GeneralUser;

public class AdminUserImpl implements GeneralUser, AdminUser {

    @Override
    public boolean login(String username, String password) {
        return true;
    }

    @Override
    public boolean register(String username, String password, String emailId) {
        return true;
    }

    @Override
    public void checkOtherUsersList() {
        System.out.println(" Check other users list");
    }
}
