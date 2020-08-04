package com.wqw.study.mybatis;


public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer permissions;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", permissions=" + permissions +
                '}';
    }

    public User(Integer id, String username, String password, Integer permissions) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.permissions = permissions;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPermissions() {
        return permissions;
    }

    public void setPermissions(Integer permissions) {
        this.permissions = permissions;
    }
}
