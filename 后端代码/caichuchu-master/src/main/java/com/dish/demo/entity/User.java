package com.dish.demo.entity;

public class User {
    //用户唯一标识符
    private String user_openID;
    //用户名·
    private String user_name;
    //用户头像url
    private String user_photo;

    public User() {

    }
    public User(String user_openID, String user_name, String user_photo) {
        this.user_openID = user_openID;
        this.user_name = user_name;
        this.user_photo =user_photo;
    }

    public String getUser_openID() {
        return user_openID;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_photo() {
        return user_photo;
    }

    public void setUser_openID(String user_openID) {
        this.user_openID = user_openID;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_photo(String user_photo) {
        this.user_photo = user_photo;
    }

    @Override
    public String toString() {
        return "user{" +
                "user_openID='" + user_openID + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_photo='" + user_photo + '\'' +
                '}';
    }
}
