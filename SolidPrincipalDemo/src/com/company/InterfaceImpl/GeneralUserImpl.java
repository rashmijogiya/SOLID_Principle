package com.company.InterfaceImpl;

import com.company.Interface.GeneralUser;
import com.company.Interface.RepositoryLayer;

public class GeneralUserImpl implements GeneralUser  {

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
       RepositoryLayerImpl rpl=new RepositoryLayerImpl();
        rpl.saveUser(username, password, emailId);
        return true;
    }

}
