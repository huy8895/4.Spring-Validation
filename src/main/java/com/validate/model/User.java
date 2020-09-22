package com.validate.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {

    @NotEmpty(message = "khong duoc de trong")
//    @Size(min = 2, max = 30,message = "toi tieu la 2 va max = 30 ki tu")
    @Pattern(regexp="[A-Za-z]{4,7}")
    private String name;

    @Min(value = 18,message = "toi thieu tu 18 tuoi")
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
