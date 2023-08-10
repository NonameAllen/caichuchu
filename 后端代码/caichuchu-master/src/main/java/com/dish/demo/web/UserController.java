package com.dish.demo.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.dish.demo.entity.User;
import com.dish.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController    // @Controller  和 @ResponseBody的结合
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有用户信息
     * @return
     */
    @RequestMapping(value = "/listuser", method = RequestMethod.GET)
    private Map<String, Object> listUser() {
        Map<String, Object> modelMap = new HashMap<>();
        List<User> list = new ArrayList<User>();
        // 获取区域列表
        list = userService.getUserList();
        modelMap.put("userlist", list);
        return modelMap;
    }

    /**
     * 通过区域Id获取区域信息
     * @param userID
     * @return
     */
    @RequestMapping(value = "/getuserbyid", method = RequestMethod.GET)
    private Map<String, Object> getUserById(String userID) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取区域信息
        User user = userService.getUserById(userID);
        modelMap.put("user", user);
        return modelMap;
    }

    /**
     * 添加用户信息
     * @param user
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    private Map<String, Object> addUser(@RequestBody User user)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 添加区域信息
        modelMap.put("success", userService.addUser(user));
        System.out.println("test user controller");
        return modelMap;
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @RequestMapping(value = "/modifyuser", method = RequestMethod.POST)
    private Map<String, Object> modifyUser(@RequestBody User user)
            throws JsonParseException, JsonMappingException, IOException {
        System.out.println("输出user"+user);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改区域信息
        modelMap.put("success", userService.modifyUser(user));
        return modelMap;
    }

    /**
     * 删除用户
     * @param user_openID
     * @return
     */
    @RequestMapping(value = "/deleteuser", method = RequestMethod.POST)
    private Map<String, Object> removeUser(@RequestBody String user_openID) {

        System.out.println("要删除的userid  "+user_openID);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改区域信息
        modelMap.put("success", userService.deleteUser(user_openID));
        return modelMap;
    }

}

