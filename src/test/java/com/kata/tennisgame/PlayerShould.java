package com.kata.tennisgame;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PlayerShould {

    private Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player("player1");
    }

    @Test
    public void return_all_possible_player_score_for_a_set() {
        assertThat(player.getScore(), is("Love"));

        player.wonPoint();
        assertThat(player.getScore(), is("Fifteen"));

        player.wonPoint();
        assertThat(player.getScore(), is("Thirty"));

        player.wonPoint();
        assertThat(player.getScore(), is("Forty"));

        player.wonPoint();
        assertThat(player.getScore(), is("Advantage player1"));
    }

    @Test
    public void player_wins() {
        playWinningGame();
        assertThat(player.getScore(), is("Win for player1"));
    }

    private void playWinningGame() {
        for (int i = 0; i < 5; i++) {
            player.wonPoint();
        }
    }
}