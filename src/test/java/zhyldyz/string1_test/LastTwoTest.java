package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.LastTwo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LastTwoTest {

    LastTwo lastTwo = new LastTwo();

    @Test(dataProvider = "lastTwoDataProvider")
    void lastTwoTest(String str, String exception) {

        assertEquals(lastTwo.lastTwo(str), exception);

    }

    @DataProvider(name = "lastTwoDataProvider")
    public String[][] lastTwoDataProvider() {
        return new String[][]{

                {"coding", "codign"},
                {"cat", "cta"},
                {"ab", "ba"},
                {"a", "a"},
                {"", ""}

        };
    }
}