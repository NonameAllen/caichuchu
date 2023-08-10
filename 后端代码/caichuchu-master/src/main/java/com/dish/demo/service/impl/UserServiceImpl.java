package com.dish.demo.service.impl;

import java.util.Date;
import java.util.List;

import com.dish.demo.dao.*;
import com.dish.demo.entity.*;
import com.dish.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dish.demo.dao.*;
import com.dish.demo.service.*;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.queryUser();
    }

    @Override
    public User getUserById(String user_openID) {
        return userDao.queryUserById(user_openID);
    }

    @Transactional(rollbackFor =Exception.class)
    @Override
    public boolean addUser(User user) {
        System.out.println("test99impl"+user);
        // 空值判断，主要是判断areaName不为空
        if (user.getUser_name() != null && !"".equals(user.getUser_name())) {
            try {
                int effectedNum = userDao.insertUser(user);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("添加用户信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("添加用户信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("用户信息不能为空！");
        }
    }

    @Transactional(rollbackFor =Exception.class)
    @Override
    public boolean modifyUser(User user) {
        // 空值判断，主要是判断areaName不为空
        if (user.getUser_name() != null && !"".equals(user.getUser_name())) {
            try {
                int effectedNum = userDao.updataUser(user);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("修改用户信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("修改用户信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("用户信息不能为空！");
        }
    }

    @Transactional(rollbackFor =Exception.class)
    @Override
    public boolean deleteUser(String user_openID) {
        if (!user_openID.equals(null)) {
            try {
                // 删除区域信息
                int effectedNum = userDao.deleteUser(user_openID);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除区域信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除区域信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("区域Id不能为空！");
        }
    }
}
