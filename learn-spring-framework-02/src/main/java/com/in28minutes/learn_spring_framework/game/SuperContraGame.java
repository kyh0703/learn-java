package com.in28minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGame")
public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("Super Contra up");
    }

    public void down() {
        System.out.println("Super Contra down");
    }

    public void left() {
        System.out.println("Super Contra left");
    }

    public void right() {
        System.out.println("Super Contra right");
    }

}
