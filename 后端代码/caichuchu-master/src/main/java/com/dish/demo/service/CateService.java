package com.dish.demo.service;

import com.dish.demo.entity.Cate;

import java.util.List;

/**
 * @ClassName CateService
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/6 10:23
 * @Version 1.0
 */
public interface CateService {

    /**
     * 获取菜品列表
     *
     * @return
     */
    List<Cate> getCateList();

    /**
     * 通过菜品Id获取菜品信息
     *
     * @param
     * @return
     */
    Cate getCateById(String cate_id);

    /**
     * 增加菜品信息
     *
     * @param cate
     * @return
     */
    boolean addCate(Cate cate);

    /**
     * 修改菜品信息
     *
     * @param cate
     * @return
     */
    boolean modifyCate(Cate cate);

    /**
     * 删除菜品信息
     *
     * @param
     * @return
     */
    boolean deleteCate(String cate_id);
}
