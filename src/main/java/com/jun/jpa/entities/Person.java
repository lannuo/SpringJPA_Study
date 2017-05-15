package com.jun.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * 人员类
 * Created by JUN on 2017/5/15.
 */
@Table(name = "JPA_PERSON")
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 30)
    private String name;

    @Column(length = 50)
    private String email;

    private Integer age;

    @Column(name ="LAST_NAME",length = 30)
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
