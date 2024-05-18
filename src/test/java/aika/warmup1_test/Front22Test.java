package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.Front22;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Front22Test {
    @Test(dataProvider = "front22DataProvider")
    public void testFront22(String str, String excepted) {
        Front22 f22 = new Front22();
        assertEquals(f22.front22(str), excepted);
    }

    @DataProvider(name = "front22DataProvider")
    public Object[][] front22DataProvider() {
        return new Object[][]{{"kitten", "kikittenki"},
                {"Ha", "HaHaHa"},
                {"abc", "ababcab"},
                {"ab", "ababab"},
                {"a", "aaa"},
                {"", ""},
                {"Logic", "LoLogicLo"}};
    }
}