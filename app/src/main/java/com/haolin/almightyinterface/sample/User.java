package com.haolin.almightyinterface.sample;

/**
 * 作者：haoLin_Lee on 2019/04/29 22:45
 * 邮箱：Lhaolin0304@sina.com
 * class:
 */
public class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
