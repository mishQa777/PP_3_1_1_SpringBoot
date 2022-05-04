package com.example.pp_3_1_1_springboot2.dao;


import com.example.pp_3_1_1_springboot2.models.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);
    User getUser(long id);
    void deleteUser(long id);
    void updateUser(User user);
    List<User> getAllUsers();
}
