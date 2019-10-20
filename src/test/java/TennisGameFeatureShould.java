import com.kata.tennisgame.Console;
import com.kata.tennisgame.Player;
import com.kata.tennisgame.ScoreDisplayer;
import com.kata.tennisgame.Scoreboard;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TennisGameFeatureShould {

    @Mock
    Console console;

    private Player player_one;
    private Player player_two;
    private Scoreboard scoreboard;

    @Before
    public void setUp() throws Exception {
        ScoreDisplayer scoreDisplayer = new ScoreDisplayer(console);
        player_one = new Player("player1");
        player_two = new Player("player2");
        scoreboard = new Scoreboard(scoreDisplayer, player_one, player_two);
    }

    @Test
    public void display_players_scoreboard() {

        scoreboard.wonPoint(player_one);

        scoreboard.getScore();

        verify(console).displayLine("player1 | player2");
        verify(console).displayLine("Fifteen | Love");

    }

    @Test
    public void display_deuce_when_each_players_scored_three_points_and_scores_are_equals() {
        wins(3);

        scoreboard.getScore();

        verify(console).displayLine("player1 | player2");
        verify(console).displayLine("Deuce | Deuce");
    }

    private void wins(int games) {
        for (int i = 0; i < games; i++) {
            scoreboard.wonPoint(player_one);
            scoreboard.wonPoint(player_two);
        }
    }
}
