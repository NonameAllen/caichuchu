package com.dish.demo.service;

import java.util.List;

import com.dish.demo.entity.*;

/**
 * @author cxy
 */
public interface UserService {

    /**
     * 获取区域列表
     *
     * @return
     */
    List<User> getUserList();

    /**
     * 通过区域Id获取区域信息
     *
     * @param
     * @return
     */
    User getUserById(String user_openID);

    /**
     * 增加区域信息
     *
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 修改区域信息
     *
     * @param user
     * @return
     */
    boolean modifyUser(User user);

    /**
     * 删除区域信息
     *
     * @param
     * @return
     */
    boolean deleteUser(String user_openID);

}
