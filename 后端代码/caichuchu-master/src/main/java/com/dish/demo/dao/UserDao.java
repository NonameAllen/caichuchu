package com.dish.demo.dao;
import com.dish.demo.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author cxy
 */
@Mapper
public interface UserDao {

    /**
     * 全表查询
     * @return
     */
    List<User> queryUser();

    /**
     * 根据唯一标识符查询用户
     * @return
     */
    User queryUserById(String user_openID);

    /**
     * 插入用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 修改信息
     * @param user
     * @return
     */
    int updataUser(User user);

    /**
     * 删除用户
     * @param user_openID
     * @return
     */
    int deleteUser(String user_openID);

}
