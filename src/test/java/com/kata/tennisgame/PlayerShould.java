package com.kata.tennisgame;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PlayerShould {

    @Test
    public void return_all_possible_player_score_for_a_set() {
        Player player = new Player();

        assertThat(player.getScore(), is("Love"));

        player.wonPoint();
        assertThat(player.getScore(), is("Fifteen"));

        player.wonPoint();
        assertThat(player.getScore(), is("Thirty"));

        player.wonPoint();
        assertThat(player.getScore(), is("Forty"));
    }
}