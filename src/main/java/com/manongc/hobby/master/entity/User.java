package com.manongc.hobby.master.entity;

/**
 * @ClassName User
 * @Description TODO()
 * @Author xingchen
 * @Date 2019-10-22 22:53
 * @Version 1.0.0
 */
public class User {

    private String name;

    private String phone;

    private String password;

    private String email;

    private int num;

    public String getEmail() {
        return email;
    }
    
    private int number = 1;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
