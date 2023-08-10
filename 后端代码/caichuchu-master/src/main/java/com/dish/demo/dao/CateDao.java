package com.dish.demo.dao;

import com.dish.demo.entity.Cate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName CateDao
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/6 10:13
 * @Version 1.0
 */
@Mapper
public interface CateDao {
    /**
     * 全表查询
     * @return
     */
    List<Cate> queryCate();

    /**
     * 根据唯一标识符查询菜品
     * @return
     */
    Cate queryCateyId(String cate_id);

    /**
     * 插入菜品
     * @param cate
     * @return
     */
    int insertCate(Cate cate);

    /**
     * 修改信息
     * @param cate
     * @return
     */
    int updataCate(Cate cate);

    /**
     * 删除菜品
     * @param cate_id
     * @return
     */
    int deleteCate(String cate_id);

}
