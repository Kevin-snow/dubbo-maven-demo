package com.kevin.demo.api.service;

import com.kevin.demo.api.bean.UserAddress;

import java.util.List;

/**
 * create by kevin.
 * 用户Service, 提供用户相关的信息
 * @Date 2020/10/26
 */
public interface UserService {

    /**
     * 获取用户的收获地址信息
     * @param userId 用户id
     * @return 用户地址集合
     */
    public List<UserAddress> getUserAddressList(String userId);
}
