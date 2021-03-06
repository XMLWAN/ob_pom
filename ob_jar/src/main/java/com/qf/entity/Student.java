package com.qf.entity;

import javax.swing.*;

public class Student {

    Integer id;
    private String name;
    private Integer age;
    private Spring password;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Spring getPassword() {
        return password;
    }

    public void setPassword(Spring password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password=" + password +
                '}';
    }


}
