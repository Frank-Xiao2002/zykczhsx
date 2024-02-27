package com.xxj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Main {
    static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

    public static void main(String[] args) {
        var axe = context.getBean(Axe.class);
        System.out.println(axe);
        var date = context.getBean(Date.class);
        System.out.println(date);
    }
}