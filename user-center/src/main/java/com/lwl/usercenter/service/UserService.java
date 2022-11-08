package com.lwl.usercenter.service;

import com.lwl.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务
* @author lwl
* @description 针对表【user】的数据库操作Service
* @createDate 2022-10-13 19:54:10
*/
public interface UserService extends IService<User> {


    /**
     * 用户注册
     * @param userAccount 用户名
     * @param userPassword 密码
     * @param checkPassword 密码校验
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 用户登录
     *
     * @param userAccount  用户名
     * @param userPassword 密码
     * @param request 请求
     * @return 用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser 用户信息
     * @return 脱敏用户信息
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request 请求
     */
    int userLogout(HttpServletRequest request);
}
