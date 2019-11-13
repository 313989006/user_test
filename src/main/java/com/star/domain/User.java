package com.star.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName User
 * @Description 用户实体类
 * @Author ma.kangkang
 * @Date 2019/11/13 9:17
 **/
@Entity
@Table(name = "user")
public class User {

    // 用户id
    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String company;

    @Column
    private String phone;

    @Column
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
