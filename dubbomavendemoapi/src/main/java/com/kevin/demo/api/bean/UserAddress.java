package com.kevin.demo.api.bean;

import java.io.Serializable;

/**
 * create by kevin.
 *  用户地址信息
 * @Date 2020/10/27
 */
public class UserAddress implements Serializable {
    // ID
    private String id;
    // 用户id
    private String userId;
    // 用户姓名
    private String name;
    // 收获地址
    private String address;
    // 电话
    private String phone;
    // 是否默认地址
    private boolean isDefault;

    public UserAddress(String id, String userId, String name, String address, String phone, boolean isDefault) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.isDefault = isDefault;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}
