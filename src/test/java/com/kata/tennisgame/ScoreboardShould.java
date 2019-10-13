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
public class ScoreboardShould {

    @Mock
    Player player_one;

    @Mock
    Player player_two;

    @Mock
    ScoreDisplayer scoreDisplayer;

    private Scoreboard scoreboard;

    @Before
    public void setUp() throws Exception {
        scoreboard = new Scoreboard(scoreDisplayer, player_one, player_two);
    }

    @Test
    public void win_point() {
        scoreboard.wonPoint(player_one);

        verify(player_one).wonPoint();
    }

    @Test
    public void display_players_score() {
        List<Player> players = Arrays.asList(player_one, player_two);

        scoreboard.displayScore();

        verify(scoreDisplayer).display(players);
    }
}