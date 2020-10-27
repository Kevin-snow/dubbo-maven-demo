package com.kevin.dubbo.demo.consumer.service;

import com.kevin.demo.api.bean.UserAddress;
import com.kevin.demo.api.service.OrderService;
import com.kevin.demo.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by kevin.
 *
 * @Date 2020/10/27
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    @Override
    public void initOrder(String userId) {
        System.out.println("调用远程方法开始");
        List<UserAddress> userAddresses = userService.getUserAddressList(userId);

        for (UserAddress address : userAddresses){
            System.out.println(address.getId() + " "+ address.getName() + " " +address.getAddress());
        }
        System.out.println("调用远程方法结束");
    }
}
