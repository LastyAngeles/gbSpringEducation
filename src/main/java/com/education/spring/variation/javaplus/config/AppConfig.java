package com.education.spring.variation.javaplus.config;

import com.education.spring.variation.javaplus.example.Boss;
import com.education.spring.variation.javaplus.example.Photographer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.education.spring.variation.javaplus.example")
public class AppConfig {

    @Bean("photographer")
    public Photographer photographer(){
        Photographer photographer = new Photographer();
        return photographer;
    }

    @Bean("boss")
    public Boss boss(){
        Boss boss = new Boss();
        boss.setPhotographer(photographer());
        return boss;
    }
}
