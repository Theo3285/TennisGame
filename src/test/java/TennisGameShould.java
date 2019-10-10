import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TennisGameShould {

    @Test
    public void love_when_player1_button_is_pressed() {
        Button button = new Button();
        assertThat(button.wonPoint("player1"), is("love"));
    }
}
