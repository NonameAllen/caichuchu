package com.dish.demo.dao;

import com.dish.demo.entity.Content;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName ContentDao
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/6 10:19
 * @Version 1.0
 */
@Mapper
public interface ContentDao {

    /**
     * 全表查询
     * @return
     */
    List<Content> queryContent();

    /**
     * 根据唯一标识符查询目录
     * @return
     */
    Content queryContentyId(String content_id);

    /**
     * 插入目录
     * @param content
     * @return
     */
    int insertContent(Content content);

    /**
     * 修改信息
     * @param content
     * @return
     */
    int updataContent(Content content);

    /**
     * 删除菜品
     * @param content_id
     * @return
     */
    int deleteContent(String content_id);

}
