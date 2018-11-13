package com.education.spring.variation.xml.servant;

import com.education.spring.variation.xml.farm.Cat;
import com.education.spring.variation.xml.farm.Turtle;
import com.education.spring.variation.xml.farm.Dog;

public class Maidservant implements Pet{
    private Dog doge;
    private Cat catty;
    private Turtle turtle;

    public Maidservant(Dog doge, Cat catty, Turtle turtle) {
        this.doge = doge;
        this.catty = catty;
        this.turtle = turtle;
    }

    public void setDoge(Dog doge) {
        this.doge = doge;
    }

    public void setCatty(Cat catty) {
        this.catty = catty;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public void care() {
        if (doge.getCutieness() > 2) System.out.println(doge.getName() + " good doge! ");
        if (catty.getCutieness() >= 2) System.out.println(catty.getName() + " sweet cat!");
        System.out.println("Turtle isn't cute at all, better care about dog one time ...");
    }
}
