package com.ohgiraffus.section04.dto;

import java.util.Date;

public class UserDTO {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;



    //클래스를 만들려면 생성자가 있어야한다.
    //기본생성자 표현식 :
    //접근제어자 + 클래스명 + 소괄호() + 중괄호{}
    public UserDTO(){}

    public UserDTO(String id, String pwd, String name, java.util.Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }


    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
