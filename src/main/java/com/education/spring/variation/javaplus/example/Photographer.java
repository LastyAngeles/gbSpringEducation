package com.education.spring.variation.javaplus.example;

import org.springframework.stereotype.Component;

public class Photographer implements Camera {
    public void takePhoto() {
        System.out.println("*SHELK* Photo is ready!");
    }
}
