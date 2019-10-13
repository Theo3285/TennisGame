import com.kata.tennisgame.Console;
import com.kata.tennisgame.Player;
import com.kata.tennisgame.ScoreDisplayer;
import com.kata.tennisgame.Scoreboard;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TennisGameFeatureShould {

    @Mock
    Console console;

    @Test
    public void display_players_scoreboard() {

        ScoreDisplayer scoreDisplayer = new ScoreDisplayer(console);

        Player player_one = new Player();
        Player player_two = new Player();

        Scoreboard scoreboard = new Scoreboard(scoreDisplayer, player_one, player_two);

        scoreboard.wonPoint(player_one);

        scoreboard.displayScore();

        verify(console).displayLine("Player 1 | Player 2");
        verify(console).displayLine("Fifteen | Love");
    }
}
