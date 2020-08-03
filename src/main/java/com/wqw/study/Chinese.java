package com.wqw.study;

public class Chinese extends Person {

    public Chinese(String name,int age,String feature) {
        setAge(age);
        setFeature(feature);
        setName(name);
    }

    public Chinese() {
    }

    @Override
    public void show() {
        System.out.println("我爱你北京，留下许多的呵呵");
    }
}
