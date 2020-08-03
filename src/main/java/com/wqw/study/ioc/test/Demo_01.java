package com.wqw.study.ioc.test;

import com.wqw.study.Person;
import com.wqw.study.ioc.bean.User;
import com.wqw.study.ioc.service.UserService;
import com.wqw.study.ioc.web.UserServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo_01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        UserServlet bean = context.getBean(UserServlet.class);
        User user = bean.get();
        System.out.println(user);

        Person c2 = (Person) context.getBean("c2");
        System.out.println(c2);

        Person p3 = (Person) context.getBean("c3");
        System.out.println(p3);
    }
}
