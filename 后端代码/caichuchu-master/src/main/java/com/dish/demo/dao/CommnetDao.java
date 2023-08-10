package com.dish.demo.dao;

import com.dish.demo.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName CommnetDao
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/1 14:38
 * @Version 1.0
 */
@Mapper
public interface CommnetDao {
    /**
     * 查看所有评论
     * @return
     */
    List<Comment> queryComment();

    /**
     * 根据id查询某条评论
     * @param comment_id
     * @return
     */
    Comment queryCommentById(String comment_id);

    /**
     * 根据用户id查询用户的某条评论
     * @param user_id
     * @return
     */
    Comment queryCommentByUserId(String user_id);

    /**
     * 根据菜品名称查看某条评论
     * @param dish_id
     * @return
     */
    List<Comment> queryCommentByDishId(String dish_id);

    /**
     * 插入评论
     * @param comment
     * @return
     */
    int insertComment(Comment comment);

    /**
     * 更新评论
     * @param comment
     * @return
     */
    int updateComment(Comment comment);

    /**
     * 删除评论
     * @param comment_id
     * @return
     */
    int deleteComment(String comment_id);

}
