package com.kata.tennisgame;

public class TennisGameApp {

    public static void main(String... args) {
        Console console = new Console();
        ScoreDisplayer scoreDisplayer = new ScoreDisplayer(console);
        Player player_one = new Player();
        Player player_two = new Player();

        Scoreboard scoreboard = new Scoreboard(scoreDisplayer,player_one,player_two);

        scoreboard.wonPoint(player_one);
        scoreboard.displayScore();

        scoreboard.wonPoint(player_two);
        scoreboard.displayScore();

        scoreboard.wonPoint(player_one);
        scoreboard.displayScore();

        scoreboard.wonPoint(player_one);
        scoreboard.displayScore();
    }
}
