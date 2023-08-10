package com.dish.demo.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.dish.demo.entity.Checkin;
import com.dish.demo.service.CheckinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * @ClassName CheckinController
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/6 0:13
 * @Version 1.0
 */

@RestController
@RequestMapping("/checkin")
public class CheckinController {
    @Autowired
    private CheckinService checkinService;

    /**
     * 查询所有签到信息
     * @return
     */
    @RequestMapping(value = "/listcheckin", method = RequestMethod.GET)
    private Map<String, Object> listCheckin() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Checkin> list = new ArrayList<Checkin>();
        // 获取区域列表
        list = checkinService.getCheckinList();
        modelMap.put("checkinlist", list);
        return modelMap;
    }

    /**
     * 通过区域Id获取区域信息
     * @param checkinID
     * @return
     */
    @RequestMapping(value = "/getcheckinbyid", method = RequestMethod.GET)
    private Map<String, Object> getCheckinById(String checkinID) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取区域信息
        Checkin checkin = checkinService.getCheckinByCheckin_id(checkinID);
        modelMap.put("checkin", checkin);
        return modelMap;
    }

    /**
     * 添加签到信息
     * @param checkin
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @RequestMapping(value = "/addcheckin", method = RequestMethod.POST)
    private Map<String, Object> addCheckin(@RequestBody Checkin checkin)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 添加区域信息
        modelMap.put("success", checkinService.addCheckin(checkin));
        System.out.println("test checkin controller");
        return modelMap;
    }

    /**
     * 修改签到信息
     * @param checkin
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @RequestMapping(value = "/modifycheckin", method = RequestMethod.POST)
    private Map<String, Object> modifyCheckin(@RequestBody Checkin checkin)
            throws JsonParseException, JsonMappingException, IOException {
        System.out.println("输出checkin"+checkin);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改区域信息
        modelMap.put("success", checkinService.updateCheckin(checkin));
        return modelMap;
    }

    /**
     * 删除签到
     * @param checkin_openID
     * @return
     */
    @RequestMapping(value = "/deletecheckin", method = RequestMethod.POST)
    private Map<String, Object> removeCheckin(@RequestBody String checkin_openID) {

        System.out.println("要删除的checkinid  "+checkin_openID);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改区域信息
        modelMap.put("success", checkinService.deleteCheckin(checkin_openID));
        return modelMap;
    }

}

