package org.example.entity;


public class User {
    private Long num;
    private String id;
    private String passwd;

    public User(){

    }

    public Long GetNum(){
        return this.num;
    }
    public void setNum(Long num){
        this.num = num;
    }
    public String GetId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String GetPasswd(){
        return this.passwd;
    }

    public void setPasswd(String passwd){
        this.passwd = passwd;
    }
}
