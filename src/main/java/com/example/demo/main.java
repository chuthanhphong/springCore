package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.auditing.config.AnnotationAuditingConfiguration;

public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
         ApplicationContext context = new ClassPathXmlApplicationContext("Ioc.xml");

        MesageTest test1 = (MesageTest) context.getBean("messageTest");
        MesageTest test2 = (MesageTest) context.getBean("messageTest");
        test1.setSayHello("hello lv 1");
        System.out.println(test2.getSayHello());


        MesageTest test = (MesageTest) applicationContext.getBean("demoBean");

        System.out.println(test.getSayHello());
    }
}
