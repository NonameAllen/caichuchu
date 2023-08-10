package com.dish.demo.entity;

/**
 * @ClassName Checkin
 * @Description TODO
 * @Author Yangjinhua
 * @Date 2023/7/6 9:20
 * @Version 1.0
 */
public class Checkin {
    //签到id
    private String checkin_id;

    //签到时间
    private String checkin_date;

    //签到用户
    private User user;

    public Checkin() {
    }

    public Checkin(String checkin_id, String checkin_date, User user) {
        this.checkin_id = checkin_id;
        this.checkin_date = checkin_date;
        this.user = user;
    }

    public String getCheckin_id() {
        return checkin_id;
    }

    public void setCheckin_id(String checkin_id) {
        this.checkin_id = checkin_id;
    }

    public String getCheckin_date() {
        return checkin_date;
    }

    public void setCheckin_date(String checkin_date) {
        this.checkin_date = checkin_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Checkin{" +
                "checkin_id='" + checkin_id + '\'' +
                ", checkin_date='" + checkin_date + '\'' +
                ", user=" + user +
                '}';
    }
}
