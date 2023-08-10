package com.dish.demo.dao;

import com.dish.demo.entity.Checkin;
import com.dish.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName CheckinDao
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/6 9:36
 * @Version 1.0
 */
@Mapper
public interface CheckinDao {

    /**
     * 全表查询
     * @return
     */
    List<Checkin> queryCheckin();

    /**
     * 根据唯一标识符查询签到
     * @return
     */
    Checkin queryCheckinById(String checkin_id);

    /**
     * 插入签到
     * @param checkin
     * @return
     */
    int inserCheckin(Checkin checkin);

    /**
     * 修改信息
     * @param checkin
     * @return
     */
    int updataCheckin(Checkin checkin);

    /**
     * 删除签到
     * @param checkin_id
     * @return
     */
    int deleteCheckin(String checkin_id);
}
