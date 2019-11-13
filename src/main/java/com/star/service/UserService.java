package com.star.service;

import com.star.domain.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    User getUserById(Integer id);

    int updateUser (User user);

    List<User> getUser(User user);

    int addUser(User user);

    int deleteUser(User user);

}
