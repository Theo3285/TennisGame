package com.kata.tennisgame;

import org.junit.Before;
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

    private static final String HEADER = "player1 | player2";

    @Mock
    Console console;

    @Mock
    Player player_one;

    @Mock
    Player player_two;

    private List<Player> players;
    private ScoreDisplayer scoreDisplayer;

    @Before
    public void setUp() throws Exception {
        players = Arrays.asList(player_one, player_two);
        scoreDisplayer = new ScoreDisplayer(console);
    }

    @Test
    public void display_players_score() {
        given(player_one.getScore()).willReturn("Fifteen");
        given(player_two.getScore()).willReturn("Love");


        scoreDisplayer.display(players);

        verify(console).displayLine(HEADER);
        verify(console).displayLine("Fifteen | Love");
    }

    @Test
    public void display_deuce_when_players_score_are_equals_and_above_thirty() {
        given(player_one.getScore()).willReturn("Forty");
        given(player_two.getScore()).willReturn("Forty");

        scoreDisplayer.display(players);

        verify(console).displayLine(HEADER);
        verify(console).displayLine("Deuce | Deuce");
    }
}