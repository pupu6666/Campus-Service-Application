package com.XyDp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.XyDp.dto.LoginFormDTO;
import com.XyDp.dto.Result;
import com.XyDp.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
