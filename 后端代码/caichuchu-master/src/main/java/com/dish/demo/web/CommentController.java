package com.dish.demo.web;

import com.dish.demo.entity.Comment;
import com.dish.demo.entity.Dish;
import com.dish.demo.service.CommentService;
import com.fasterxml.jackson.databind.JsonMappingException;
//import javafx.beans.binding.ObjectExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CommentController
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/1 15:18
 * @Version 1.0
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 获取全部评论
     * @return
     */
    @RequestMapping(value = "/listcomment", method = RequestMethod.GET)
    private Map<String, Object> listcomment() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Comment> list = new ArrayList<Comment>();
        // 获取全部评论
        list = commentService.getCommentList();
        modelMap.put("commentlist", list);
        return modelMap;
    }

    /**
     * 通过评论id获得某条评论
     * @param comment_id
     * @return
     */
    @RequestMapping(value = "/getCommentByCommentId", method = RequestMethod.GET)
    private Map<String, Object> getCommentByCommentId(String comment_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 通过评论id获得某条评论
        Comment comment = commentService.getCommentByCommentId(comment_id);
        modelMap.put("comment", comment);
        return modelMap;
    }

    /**
     * 通过菜品id获得评论
     * @param dish_id
     * @return
     */
    @RequestMapping(value = "/getCommentByDishId", method = RequestMethod.GET)
    private Map<String, Object> getCommentByDishId(String dish_id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Comment> list = new ArrayList<Comment>();
        // 通过菜品id获得某条评论
        list = commentService.getCommentByDishId(dish_id);
        modelMap.put("comment", list);
        return modelMap;
    }

    /**
     * 添加评论
     * @param comment
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @RequestMapping(value = "/addComment", method = RequestMethod.POST)
    private Map<String, Object> addComment(@RequestBody Comment comment)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 添加评论
        modelMap.put("success", commentService.addComment(comment));
        return modelMap;
    }

    /**
     * 修改评论
     * @param comment
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @RequestMapping(value = "/modifyComment", method = RequestMethod.POST)
    private Map<String, Object> modifyComment(@RequestBody Comment comment)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改评论
        modelMap.put("success", commentService.modifyComment(comment));
        return modelMap;
    }

    /**
     * 删除评论
     * @param comment_id
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    @RequestMapping(value = "/removeComment", method = RequestMethod.POST)
    private Map<String, Object> removeComment(String comment_id)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 删除评论
        modelMap.put("success", commentService.deleteComment(comment_id));
        return modelMap;
    }

}
