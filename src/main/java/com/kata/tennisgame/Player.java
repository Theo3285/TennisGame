package com.kata.tennisgame;

public class Player {

    int point = 1;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    void wonPoint() {
        point++;
    }

    String getScore() {
        return Score.forWinning(point, name);
    }

}
