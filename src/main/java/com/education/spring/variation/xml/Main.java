package com.education.spring.variation.xml;

import com.education.spring.variation.xml.servant.Maidservant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Maidservant maidservant = context.getBean("maidservant", Maidservant.class);

        maidservant.care();
    }
}
