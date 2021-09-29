package com.company.InterfaceImpl;

import com.company.Interface.RepositoryLayer;

public class RepositoryLayerImpl implements RepositoryLayer {
    @Override
    public boolean saveUser(String username, String password, String email) {
        System.out.println(" User is saved in Database");
        return true;
    }
}
