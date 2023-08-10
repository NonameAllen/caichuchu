package com.dish.demo.entity;

/**
 * @ClassName Content
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/6 10:17
 * @Version 1.0
 */
public class Content {

    private String content_id;

    private String content_name;

    private Cate cate;

    public Content() {
    }

    public Content(String content_id, String content_name, Cate cate) {
        this.content_id = content_id;
        this.content_name = content_name;
        this.cate = cate;
    }

    public String getContent_id() {
        return content_id;
    }

    public void setContent_id(String content_id) {
        this.content_id = content_id;
    }

    public String getContent_name() {
        return content_name;
    }

    public void setContent_name(String content_name) {
        this.content_name = content_name;
    }

    public Cate getCate() {
        return cate;
    }

    public void setCate(Cate cate) {
        this.cate = cate;
    }

    @Override
    public String toString() {
        return "Content{" +
                "content_id='" + content_id + '\'' +
                ", content_name='" + content_name + '\'' +
                ", cate=" + cate +
                '}';
    }
}
