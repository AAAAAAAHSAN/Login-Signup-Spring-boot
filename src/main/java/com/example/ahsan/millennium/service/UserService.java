package com.example.ahsan.millennium.service;


import com.example.ahsan.millennium.model.User;

public interface UserService {
     void saveUser(User user);

     boolean isUserAlreadyPresent(User user);
}
