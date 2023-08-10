package com.dish.demo.service;

import com.dish.demo.entity.Checkin;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CheckinService
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/6 9:51
 * @Version 1.0
 */
@Service
public interface CheckinService {

    /**
     * 查询全部签到
     * @return
     */
    List<Checkin> getCheckinList();

    /**
     * 通过签到id查询签到
     * @param check_id
     * @return
     */
    Checkin getCheckinByCheckin_id(String check_id);

    /**
     * 增加签到
     * @param checkin
     * @return
     */
    boolean addCheckin(Checkin checkin);

    /**
     * 删除签到
     * @param check_id
     * @return
     */
    boolean deleteCheckin(String  check_id);

    /**
     * 更新签到
     * @param checkin
     * @return
     */
    boolean updateCheckin(Checkin checkin);
}
