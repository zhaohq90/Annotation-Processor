package com.yellow.doc;

import com.yellow.anno.MyId;

public class Document {

    @MyId
    private String name;
    
    @MyId
    private Integer age;

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

    @Override
    public String toString() {
        return "Document [name=" + name + ", age=" + age + "]";
    }
    
    
}
