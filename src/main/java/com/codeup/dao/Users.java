package com.codeup.dao;

import com.codeup.models.Ad;
import com.codeup.models.User;


public interface Users {
    User findByUsername(String username);
    Long insert(User user);
    void deleteUser(User user);
    void editUser(User user);
}