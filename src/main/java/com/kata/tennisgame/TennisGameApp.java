package com.kata.tennisgame;

public class TennisGameApp {

    public static void main(String... args) {
        Console console = new Console();
        ScoreDisplayer scoreDisplayer = new ScoreDisplayer(console);
        Player player_one = new Player("player1");
        Player player_two = new Player("player2");

        Scoreboard scoreboard = new Scoreboard(scoreDisplayer,player_one,player_two);

        scoreboard.wonPoint(player_one);
        scoreboard.getScore();

        scoreboard.wonPoint(player_two);
        scoreboard.getScore();

        scoreboard.wonPoint(player_one);
        scoreboard.getScore();

        scoreboard.wonPoint(player_one);
        scoreboard.getScore();

        scoreboard.wonPoint(player_one);
        scoreboard.getScore();
    }
}
