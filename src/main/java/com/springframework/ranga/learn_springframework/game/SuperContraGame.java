package com.springframework.ranga.learn_springframework.game;

import org.springframework.stereotype.Component;

//@Component
public class SuperContraGame implements Games{
    public void up() {
        System.out.println("SuperContraGame Shoot");
    }

    public void down() {
        System.out.println("SuperContraGame Roll");
    }

    public void left() {
        System.out.println("SuperContraGame Back");
    }

    public void right() {
        System.out.println("SuperContraGame Forward");
    }
}
