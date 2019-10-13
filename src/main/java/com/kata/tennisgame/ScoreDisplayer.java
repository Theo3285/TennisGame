package com.kata.tennisgame;

import java.util.List;

public class ScoreDisplayer {
    private Console console;

    public ScoreDisplayer(Console console) {
        this.console = console;
    }

    public void display(List<Player> players) {
        console.displayLine("Player 1 | Player 2");
        console.displayLine(players.get(0).getScore()
                + " | "
                + players.get(1).getScore());
    }
}

