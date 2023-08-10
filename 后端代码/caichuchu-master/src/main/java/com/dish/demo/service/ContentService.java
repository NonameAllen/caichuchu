package com.dish.demo.service;

import com.dish.demo.entity.Content;

import java.util.List;

/**
 * @ClassName ContentService
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/6 10:31
 * @Version 1.0
 */
public interface ContentService {

    /**
     * 获取目录列表
     *
     * @return
     */
    List<Content> getContentList();

    /**
     * 通过目录Id获取目录信息
     *
     * @param
     * @return
     */
    Content getContentById(String content_id);

    /**
     * 增加目录信息
     *
     * @param content
     * @return
     */
    boolean addContent(Content content);

    /**
     * 修改目录信息
     *
     * @param content
     * @return
     */
    boolean modifyContent(Content content);

    /**
     * 删除目录信息
     *
     * @param
     * @return
     */
    boolean deleteContent(String content_id);
}
