package com.kata.tennisgame;

import java.util.List;

public class ScoreDisplayer {
    private static final String SCORE_HEADER = "player1 | player2";
    private static final String DEUCE_LINE = "Deuce | Deuce";

    private Console console;

    public ScoreDisplayer(Console console) {
        this.console = console;
    }

    void display(List<Player> players) {
        console.displayLine(SCORE_HEADER);

        if (isFortyForBoth(players)) {
            console.displayLine(DEUCE_LINE);

        } else {
            console.displayLine(scoreLine(players));
        }
    }

    private String scoreLine(List<Player> players) {
        return players.get(0).getScore()
                + " | "
                + players.get(1).getScore();
    }

    private boolean isFortyForBoth(List<Player> players) {
        return "Forty".equals(players.get(0).getScore()) && "Forty".equals(players.get(1).getScore());
    }
}

