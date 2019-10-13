package com.kata.tennisgame;

import java.util.ArrayList;
import java.util.List;

public class Scoreboard {

    private final ScoreDisplayer scoreDisplayer;
    private List<Player> players = new ArrayList<Player>();

    public Scoreboard(ScoreDisplayer scoreDisplayer, Player player_one, Player player_two) {
        this.scoreDisplayer = scoreDisplayer;
        players.add(player_one);
        players.add(player_two);
    }

    public void wonPoint(Player player) {
        for (Player p : players)
            if (p == player)
                player.wonPoint();
    }

    public void displayScore() {
        scoreDisplayer.display(players);
    }
}
