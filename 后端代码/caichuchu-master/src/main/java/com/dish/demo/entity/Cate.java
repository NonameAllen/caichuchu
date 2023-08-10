package com.dish.demo.entity;

/**
 * @ClassName Cate
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/6 9:25
 * @Version 1.0
 */
public class Cate {
    //菜品id
    private String cate_id;
    //菜品名称
    private String cate_name;
    //菜品图片地址
    private String cate_img;
    //菜品做法图片地址
    private String cate_howdo;
    //菜品视频地址
    private String cate_video;
    //菜品模糊分类类型
    private String cate_type;
    //菜品详细分类
    private String cate_sort;
    //菜品描述
    private String cate_desc;

    public Cate() {
    }

    public Cate(String cate_id, String cate_name,
                String cate_img, String cate_howdo, String cate_video,
                String cate_type, String cate_sort, String cate_desc) {
        this.cate_id = cate_id;
        this.cate_name = cate_name;
        this.cate_img = cate_img;
        this.cate_howdo = cate_howdo;
        this.cate_video = cate_video;
        this.cate_type = cate_type;
        this.cate_sort = cate_sort;
        this.cate_desc = cate_desc;
    }

    public String getCate_id() {
        return cate_id;
    }

    public void setCate_id(String cate_id) {
        this.cate_id = cate_id;
    }

    public String getCate_name() {
        return cate_name;
    }

    public void setCate_name(String cate_name) {
        this.cate_name = cate_name;
    }

    public String getCate_img() {
        return cate_img;
    }

    public void setCate_img(String cate_img) {
        this.cate_img = cate_img;
    }

    public String getCate_howdo() {
        return cate_howdo;
    }

    public void setCate_howdo(String cate_howdo) {
        this.cate_howdo = cate_howdo;
    }

    public String getCate_video() {
        return cate_video;
    }

    public void setCate_video(String cate_video) {
        this.cate_video = cate_video;
    }

    public String getCate_type() {
        return cate_type;
    }

    public void setCate_type(String cate_type) {
        this.cate_type = cate_type;
    }

    public String getCate_sort() {
        return cate_sort;
    }

    public void setCate_sort(String cate_sort) {
        this.cate_sort = cate_sort;
    }

    public String getCate_desc() {
        return cate_desc;
    }

    public void setCate_desc(String cate_desc) {
        this.cate_desc = cate_desc;
    }

    @Override
    public String toString() {
        return "Cate{" +
                "cate_id='" + cate_id + '\'' +
                ", cate_name='" + cate_name + '\'' +
                ", cate_img='" + cate_img + '\'' +
                ", cate_howdo='" + cate_howdo + '\'' +
                ", cate_video='" + cate_video + '\'' +
                ", cate_type='" + cate_type + '\'' +
                ", cate_sort='" + cate_sort + '\'' +
                ", cate_desc='" + cate_desc + '\'' +
                '}';
    }
}
