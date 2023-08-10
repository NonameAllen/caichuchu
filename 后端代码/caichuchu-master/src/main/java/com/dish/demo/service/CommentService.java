package com.dish.demo.service;

import com.dish.demo.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CommentService
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/1 21:00
 * @Version 1.0
 */

public interface CommentService {

    /**
     * 获取全部评论
     * @return
     */
    List<Comment> getCommentList();

    /**
     * 通过评论id获得评论
     * @param comment_id
     * @return
     */
    Comment getCommentByCommentId(String comment_id);

    /**
     * 通过评论菜品id获得评论
     * @param dish_id
     * @return
     */
    List<Comment> getCommentByDishId(String dish_id);
    /**
     * 增加评论
     * @param comment
     * @return
     */
    boolean addComment(Comment comment);

    /**
     * 修改评论
     * @param comment
     * @return
     */
    boolean modifyComment(Comment comment);

    /**
     * 根据评论id删除评论
     * @param comment_id
     * @return
     */
    boolean deleteComment(String comment_id);

}
