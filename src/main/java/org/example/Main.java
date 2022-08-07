package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread game = new Game();
        game.start();
        game.join();
    }
}