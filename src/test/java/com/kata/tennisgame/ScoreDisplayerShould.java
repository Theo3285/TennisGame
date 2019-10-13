package com.kata.tennisgame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ScoreDisplayerShould {

    @Mock
    Console console;

    @Mock
    Player player_one;

    @Mock
    Player player_two;

    @Test
    public void display_players_score() {
        List<Player> players = Arrays.asList(player_one, player_two);
        given(player_one.getScore()).willReturn("Fifteen");
        given(player_two.getScore()).willReturn("Love");

        ScoreDisplayer scoreDisplayer = new ScoreDisplayer(console);

        scoreDisplayer.display(players);

        verify(console).displayLine("Player 1 | Player 2");
        verify(console).displayLine("Fifteen | Love");
    }

}