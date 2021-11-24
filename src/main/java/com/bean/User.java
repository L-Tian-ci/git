package com.bean;

/**
 * @author 李天赐
 * 2021/11/24
 */
public class User {
    private String username;
    private String uid;
    private int a;
    public User() {
    }

    public User(String username, String uid) {
        this.username = username;
        this.uid = uid;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", uid='" + uid + '\'' +
                ", a=" + a +
                '}';
    }
}
