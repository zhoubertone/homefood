package com.lcc.hf.pojo;

public class User {
    private Integer id;

    private String userid;

    private String username;

    private Integer upassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getUpassword() {
        return upassword;
    }

    public void setUpassword(Integer upassword) {
        this.upassword = upassword;
    }
}