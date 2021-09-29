package com.company.Interface;

public interface User {

    public boolean login(String username, String password);

    public boolean register(String username, String password, String emailId);

    boolean sendEmail(String email);

    void logError(String error);

}
