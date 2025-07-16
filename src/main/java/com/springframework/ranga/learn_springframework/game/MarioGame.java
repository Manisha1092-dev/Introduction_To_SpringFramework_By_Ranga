package com.springframework.ranga.learn_springframework.game;

public class MarioGame implements Games {
    public void up() {
        System.out.println("MarioGame Jump");
    }

    public void down() {
        System.out.println("MarioGame Sit");
    }

    public void left() {
        System.out.println("MarioGame Stop");
    }

    public void right() {
        System.out.println("MarioGame Run");
    }
}
