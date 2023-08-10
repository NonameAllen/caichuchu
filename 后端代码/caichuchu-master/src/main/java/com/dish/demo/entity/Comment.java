package com.dish.demo.entity;

/**
 * @ClassName Comment
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/1 18:54
 * @Version 1.0
 */
public class Comment {
    private String comment_id;
    private String dish_id;
    private String user_id;
    private String comment_date;
    private String comment_description;
    private User user;
    private Dish dish;

    public Comment() {
    }

    public Comment(String comment_id, String dish_id, String user_id,
                   String comment_date, String comment_description, User user, Dish dish) {
        this.comment_id = comment_id;
        this.dish_id = dish_id;
        this.user_id = user_id;
        this.comment_date = comment_date;
        this.comment_description = comment_description;
        this.user = user;
        this.dish = dish;
    }

    public String getComment_id() {
        return comment_id;
    }

    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }

    public String getDish_id() {
        return dish_id;
    }

    public void setDish_id(String dish_id) {
        this.dish_id = dish_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getComment_date() {
        return comment_date;
    }

    public void setComment_date(String comment_date) {
        this.comment_date = comment_date;
    }

    public String getComment_description() {
        return comment_description;
    }

    public void setComment_description(String comment_description) {
        this.comment_description = comment_description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment_id='" + comment_id + '\'' +
                ", dish_id='" + dish_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", comment_date='" + comment_date + '\'' +
                ", comment_description='" + comment_description + '\'' +
                ", user=" + user +
                ", dish=" + dish +
                '}';
    }
}
