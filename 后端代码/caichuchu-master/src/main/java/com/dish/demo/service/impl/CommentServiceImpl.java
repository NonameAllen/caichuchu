package com.dish.demo.service.impl;

import com.dish.demo.dao.CommnetDao;
import com.dish.demo.entity.Comment;
import com.dish.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName CommentServiceImpl
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/1 21:05
 * @Version 1.0
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommnetDao commnetDao;

    @Override
    public List<Comment> getCommentList() {
        return commnetDao.queryComment();
    }

    @Override
    public Comment getCommentByCommentId(String comment_id) {
        return commnetDao.queryCommentById(comment_id);
    }
    @Override
    public List<Comment> getCommentByDishId(String dish_id) {
        return commnetDao.queryCommentByDishId(dish_id);
    }
    @Transactional(rollbackFor =Exception.class)
    @Override
    public boolean addComment(Comment comment) {
        // 空值判断，主要是判断comment_id不为空
        if (comment.getComment_id() != null && !"".equals(comment.getComment_id())) {
            try {
                int effectedNum = commnetDao.insertComment(comment);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("添加评论失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("添加评论失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("评论信息不能为空！");
        }
    }

    @Override
    public boolean modifyComment(Comment comment) {
        // 空值判断，主要是判断comment_id不为空
        if (comment.getComment_id() != null && !"".equals(comment.getComment_id())) {
            try {
                int effectedNum = commnetDao.updateComment(comment);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新评论失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新评论失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("更新信息不能为空！");
        }
    }

    @Override
    public boolean deleteComment(String comment_id) {
        if (comment_id != null) {
            try {
                // 删除区域信息
                int effectedNum = commnetDao.deleteComment(comment_id);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除评论失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除评论失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("评论id不能为空！");
        }
    }
}
