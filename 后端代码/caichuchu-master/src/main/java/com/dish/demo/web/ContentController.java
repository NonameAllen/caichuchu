package com.dish.demo.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.dish.demo.entity.Content;
import com.dish.demo.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


/**
 * @ClassName ContentController
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/6 0:13
 * @Version 1.0
 */

@RestController
@RequestMapping("/content")
public class ContentController {
    @Autowired
    private ContentService contentService;

    /**
     * 查询所有目录信息
     * @return
     */
    @RequestMapping(value = "/listcontent", method = RequestMethod.GET)
    private Map<String, Object> listContent() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Content> list = new ArrayList<Content>();
        // 获取区域列表
        list = contentService.getContentList();
        modelMap.put("contentlist", list);
        return modelMap;
    }

    /**
     * 通过区域Id获取区域信息
     * @param contentID
     * @return
     */
    @RequestMapping(value = "/getcontentbyid", method = RequestMethod.GET)
    private Map<String, Object> getContentById(String contentID) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取区域信息
        Content content = contentService.getContentById(contentID);
        modelMap.put("content", content);
        return modelMap;
    }

    /**
     * 添加目录信息
     * @param content
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @RequestMapping(value = "/addcontent", method = RequestMethod.POST)
    private Map<String, Object> addContent(@RequestBody Content content)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 添加区域信息
        modelMap.put("success", contentService.addContent(content));
        System.out.println("test content controller");
        return modelMap;
    }

    /**
     * 修改目录信息
     * @param content
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @RequestMapping(value = "/modifycontent", method = RequestMethod.POST)
    private Map<String, Object> modifyContent(@RequestBody Content content)
            throws JsonParseException, JsonMappingException, IOException {
        System.out.println("输出content"+content);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改区域信息
        modelMap.put("success", contentService.modifyContent(content));
        return modelMap;
    }

    /**
     * 删除目录
     * @param content_openID
     * @return
     */
    @RequestMapping(value = "/deletecontent", method = RequestMethod.POST)
    private Map<String, Object> removeContent(@RequestBody String content_openID) {

        System.out.println("要删除的contentid  "+content_openID);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改区域信息
        modelMap.put("success", contentService.deleteContent(content_openID));
        return modelMap;
    }

}

