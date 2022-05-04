package com.example.pp_3_1_1_springboot2.service;



import com.example.pp_3_1_1_springboot2.models.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    User getUser(long id);
    void deleteUser(long id);
    void updateUser(User user);
    List<User> getAllUsers();
}
