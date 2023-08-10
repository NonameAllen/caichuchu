package com.dish.demo.service.impl;

import java.util.Date;
import java.util.List;

import com.dish.demo.dao.*;
import com.dish.demo.entity.*;
import com.dish.demo.entity.Cate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dish.demo.dao.*;
import com.dish.demo.service.*;

@Service
public class CateServiceImpl implements CateService{

    @Autowired
    private CateDao cateDao;

    @Override
    public List<Cate> getCateList() {
        return cateDao.queryCate();
    }

    @Override
    public Cate getCateById(String cate_id) {
        return cateDao.queryCateyId(cate_id);
    }

    @Transactional(rollbackFor =Exception.class)
    @Override
    public boolean addCate(Cate cate) {
        System.out.println("test99impl"+cate);
        // 空值判断，主要是判断areaName不为空
        if (cate.getCate_name() != null && !"".equals(cate.getCate_name())) {
            try {
                int effectedNum = cateDao.insertCate(cate);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("添加菜品信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("添加菜品信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("菜品信息不能为空！");
        }
    }

    @Transactional(rollbackFor =Exception.class)
    @Override
    public boolean modifyCate(Cate cate) {
        // 空值判断，主要是判断areaName不为空
        if (cate.getCate_name() != null && !"".equals(cate.getCate_name())) {
            try {
                int effectedNum = cateDao.updataCate(cate);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("修改菜品信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("修改菜品信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("菜品信息不能为空！");
        }
    }

    @Transactional(rollbackFor =Exception.class)
    @Override
    public boolean deleteCate(String cate_id) {
        if (!cate_id.equals(null)) {
            try {
                // 删除区域信息
                int effectedNum = cateDao.deleteCate(cate_id);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除区域信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除区域信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("区域Id不能为空！");
        }
    }
}
