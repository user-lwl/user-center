package com.lwl.usercenter.service;

import com.lwl.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


/**
 * 用户服务测试
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void testAddUser() {

        User user = new User();

        user.setUsername("lwl");
        user.setUserAccount("123");
        user.setAvatarUrl("xx");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("123");

        boolean result = userService.save(user);
        System.out.println(result);
        Assertions.assertTrue(result);
    }

//    @Test
//    void userRegister() {
//        String userAccount = "lwl";
//        String userPassword = "123456";
//        String checkPassword = "123465";
//        String planetCode = "123456";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1, result);
//    }
}