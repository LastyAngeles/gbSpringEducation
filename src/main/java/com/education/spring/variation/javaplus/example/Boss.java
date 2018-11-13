package com.education.spring.variation.javaplus.example;

import org.springframework.stereotype.Component;

public class Boss {
    private Photographer photographer;

    public Photographer getPhotographer() {
        return photographer;
    }

    public void setPhotographer(Photographer photographer) {
        this.photographer = photographer;
    }

    public void doPhoto(){
        photographer.takePhoto();
    }
}
