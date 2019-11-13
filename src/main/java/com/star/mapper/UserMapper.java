package com.star.mapper;

import com.star.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAllUser();

    User getUserById(Integer id);

    int updateUser (User user);

    List<User> getUser(User user);

    int addUser(User user);

    int deleteUser(User user);

}
