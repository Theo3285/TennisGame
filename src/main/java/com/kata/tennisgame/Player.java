package com.kata.tennisgame;

public class Player {

    int point = 1;

    public void wonPoint() {
        point++;
    }

    public String getScore() {
        return Score.forWinning(point);
    }

}
