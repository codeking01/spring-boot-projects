package com.codeking.boot.bean;

/**
 * @author : codeking
 * @create : 2022/11/28 22:26
 */
public class User {
    private String userName;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
