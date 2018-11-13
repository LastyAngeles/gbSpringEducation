package com.education.spring.variation.java;

import com.education.spring.variation.java.config.AppConfig;
import com.education.spring.variation.java.manufactory.Baker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Baker[] bakers = {context.getBean("donutBaker", Baker.class), context.getBean("maffinBaker", Baker.class)};

        for (Baker baker : bakers){
            baker.bake();
        }
    }
}
