package com.in28minutes.learn_spring_framework;

public class App01GamingBasic {
    public static void main(String[] args) {
        var game = new PacmanGame();
        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }

}
