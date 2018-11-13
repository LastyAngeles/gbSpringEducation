package com.education.spring.variation.javaplus;

import com.education.spring.variation.javaplus.config.AppConfig;
import com.education.spring.variation.javaplus.example.Boss;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Boss boss = context.getBean("boss", Boss.class);
        boss.doPhoto();
    }
}
