package com.star.controller;

import com.star.domain.User;
import com.star.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2019/11/13 9:32
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
    * @Description: 跳转到用户详情界面
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2019/11/13
    */
    @RequestMapping({"/","/detail"})
    public String getAllUser(Model model){
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "user";
    }

    /**
    * @Description: 跳转到更新用户界面
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2019/11/13
    */
    @RequestMapping("/toUpdate")
    public String toUpdate(User user,Model model){
        // 根据id查询User
        user = userService.getUserById(user.getId());
        model.addAttribute("user",user);
        return "update";
    }

    /**
    * @Description: 更新用户
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2019/11/13
    */
    @RequestMapping("/update")
    public String updateUser(User user,Model model){
        // 根据id查询User
        userService.updateUser(user);
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "user";
    }

    /**
    * @Description: 根据用户名、手机号查询用户详情
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2019/11/13
    */
    @RequestMapping("/select")
    public String getUser(User user,Model model){
        // 根据id查询User
        List<User> userList = userService.getUser(user);
        model.addAttribute("userList",userList);
        return "user";
    }

    /**
    * @Description: 跳转到新增用户界面
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2019/11/13
    */
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    /**
    * @Description: 新增用户
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2019/11/13
    */
    @RequestMapping("/add")
    public String addUser(User user,Model model){
        // 根据id查询User
        userService.addUser(user);
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "user";
    }

    /**
    * @Description: 删除用户
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2019/11/13
    */
    @RequestMapping("/delete")
    public String deleteUser(User user,Model model){
        // 根据id查询User
        userService.deleteUser(user);
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "user";
    }

}
