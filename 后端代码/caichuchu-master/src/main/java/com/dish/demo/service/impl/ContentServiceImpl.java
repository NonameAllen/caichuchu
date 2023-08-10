package com.dish.demo.service.impl;

import java.util.Date;
import java.util.List;

import com.dish.demo.dao.*;
import com.dish.demo.entity.*;
import com.dish.demo.entity.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dish.demo.dao.*;
import com.dish.demo.service.*;

@Service
public class ContentServiceImpl implements ContentService{

    @Autowired
    private ContentDao contentDao;

    @Override
    public List<Content> getContentList() {
        return contentDao.queryContent();
    }

    @Override
    public Content getContentById(String content_id) {
        return contentDao.queryContentyId(content_id);
    }

    @Transactional(rollbackFor =Exception.class)
    @Override
    public boolean addContent(Content content) {
        System.out.println("test99impl"+content);
        // 空值判断，主要是判断areaName不为空
        if (content.getContent_name() != null && !"".equals(content.getContent_name())) {
            try {
                int effectedNum = contentDao.insertContent(content);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("添加目录信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("添加目录信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("目录信息不能为空！");
        }
    }

    @Transactional(rollbackFor =Exception.class)
    @Override
    public boolean modifyContent(Content content) {
        // 空值判断，主要是判断areaName不为空
        if (content.getContent_name() != null && !"".equals(content.getContent_name())) {
            try {
                int effectedNum = contentDao.updataContent(content);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("修改目录信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("修改目录信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("目录信息不能为空！");
        }
    }

    @Transactional(rollbackFor =Exception.class)
    @Override
    public boolean deleteContent(String content_openID) {
        if (!content_openID.equals(null)) {
            try {
                // 删除区域信息
                int effectedNum = contentDao.deleteContent(content_openID);
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
