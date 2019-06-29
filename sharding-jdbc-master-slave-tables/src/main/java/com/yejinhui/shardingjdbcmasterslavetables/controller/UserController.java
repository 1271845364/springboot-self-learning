package com.yejinhui.shardingjdbcmasterslavetables.controller;

import com.yejinhui.shardingjdbcmasterslavetables.entity.User;
import com.yejinhui.shardingjdbcmasterslavetables.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jinhui.ye@ucarinc.com
 * @date 2019/06/29
 */
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> list() {
        return userService.list();
    }

    @GetMapping("/add")
    public void add() {
        for (int i = 10000; i < 30000; i++) {
            User user = new User();
            user.setId(i);
            user.setUsername("yejinhui" + i);
            user.setPassword("123");
            userService.addUser(user);
            logger.info("insert:" + user.toString());
        }
    }

}