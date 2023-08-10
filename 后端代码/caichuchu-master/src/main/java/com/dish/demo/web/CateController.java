package com.dish.demo.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.dish.demo.entity.Cate;
import com.dish.demo.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
@RequestMapping("/cate")
public class CateController {
    @Autowired
    private CateService cateService;

    /**
     * 查询所有菜品信息
     * @return
     */
    @RequestMapping(value = "/listcate", method = RequestMethod.GET)
    private Map<String, Object> listCate() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Cate> list = new ArrayList<Cate>();
        // 获取区域列表
        list = cateService.getCateList();
        modelMap.put("catelist", list);
        return modelMap;
    }

    /**
     * 通过区域Id获取区域信息
     * @param cateID
     * @return
     */
    @RequestMapping(value = "/getcatebyid", method = RequestMethod.GET)
    private Map<String, Object> getCateById(String cateID) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取区域信息
        Cate cate = cateService.getCateById(cateID);
        modelMap.put("cate", cate);
        return modelMap;
    }

    /**
     * 添加菜品信息
     * @param cate
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @RequestMapping(value = "/addcate", method = RequestMethod.POST)
    private Map<String, Object> addCate(@RequestBody Cate cate)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 添加区域信息
        modelMap.put("success", cateService.addCate(cate));
        System.out.println("test cate controller");
        return modelMap;
    }

    /**
     * 修改菜品信息
     * @param cate
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @RequestMapping(value = "/modifycate", method = RequestMethod.POST)
    private Map<String, Object> modifyCate(@RequestBody Cate cate)
            throws JsonParseException, JsonMappingException, IOException {
        System.out.println("输出cate"+cate);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改区域信息
        modelMap.put("success", cateService.modifyCate(cate));
        return modelMap;
    }

    /**
     * 删除菜品
     * @param cate_openID
     * @return
     */
    @RequestMapping(value = "/deletecate", method = RequestMethod.POST)
    private Map<String, Object> removeCate(@RequestBody String cate_openID) {

        System.out.println("要删除的cateid  "+cate_openID);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改区域信息
        modelMap.put("success", cateService.deleteCate(cate_openID));
        return modelMap;
    }

}

