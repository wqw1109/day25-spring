package com.wqw.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo_01 {
    public static void main(String[] args) {
        quickStart();
    }

    public static void quickStart(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        Person p = (Person) applicationContext.getBean("c1");
        p.show();
    }
}
