package com.kevin.dubbo.demo.provider.service;

import com.kevin.demo.api.bean.UserAddress;
import com.kevin.demo.api.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * create by kevin.
 *
 * @Date 2020/10/27
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        List<UserAddress> userAddresses = new ArrayList<>();
        userAddresses.add(new UserAddress("1","1","张三",
                "北京市昌平区西二旗地铁站A口","15010897632",true));
        userAddresses.add(new UserAddress("2","1","张三",
                "北京市海淀区西小口地铁站A口","139108987542",false));
        return userAddresses;
    }
}
