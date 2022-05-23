package con.sparta.mk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void simpleTest() {
        Assertions.assertEquals(true, 5 == 5);

    }
    @Test
    @DisplayName("Check that we can return Good Morning")
    void checkWeCanReturnGoodMorning() {
        Assertions.assertEquals("Good Morning", con.sparta.mk.App.greeting(6));

    }
    @Test
    @DisplayName("Check that we can return Good Afternoon")
    void checkWeCanReturnGoodAfternoon() {
        Assertions.assertEquals("Good Afternoon", con.sparta.mk.App.greeting(14));
    }
    @Test
    @DisplayName("Check that we can return Good Evening")
    void checkWeCanReturnGoodEvening() {
        Assertions.assertEquals("Good Evening", con.sparta.mk.App.greeting(20));
    }
    @Test
    @DisplayName("Check that we can return Not Valid")
    void checkWeCanReturnNotValid() {
        Assertions.assertEquals("Not Valid", con.sparta.mk.App.greeting(-1));
    }
}
