package com.dish.demo.service.impl;

import com.dish.demo.dao.CheckinDao;
import com.dish.demo.entity.Checkin;
import com.dish.demo.service.CheckinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName CheckinServiceImpl
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/6 9:56
 * @Version 1.0
 */
public class CheckinServiceImpl implements CheckinService {

    @Autowired
    private CheckinDao checkinDao;

    @Override
    public List<Checkin> getCheckinList() {
        return checkinDao.queryCheckin();
    }

    @Override
    public Checkin getCheckinByCheckin_id(String check_id) {
        return checkinDao.queryCheckinById(check_id);
    }

    @Transactional(rollbackFor =Exception.class)
    @Override
    public boolean addCheckin(Checkin checkin) {
        // 空值判断，主要是判断checkin_id不为空
        if (checkin.getCheckin_id() != null && !"".equals(checkin.getCheckin_id())) {
            try {
                int effectedNum = checkinDao.inserCheckin(checkin);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("添加签到失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("添加签到失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("签到信息不能为空！");
        }
    }

    @Override
    public boolean deleteCheckin(String check_id) {
        if (check_id != null) {
            try {
                // 删除区域信息
                int effectedNum = checkinDao.deleteCheckin(check_id);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除签到失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除签到失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("签到id不能为空！");
        }
    }


    @Override
    public boolean updateCheckin(Checkin checkin) {
        // 空值判断，主要是判断check_id不为空
        if (checkin.getCheckin_id() != null && !"".equals(checkin.getCheckin_id())) {
            try {
                int effectedNum = checkinDao.updataCheckin(checkin);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新签到失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新签到失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("更新信息不能为空！");
        }
    }
}
