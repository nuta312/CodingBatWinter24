package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.SeeColor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SeeColorTest {

    SeeColor seeColor = new SeeColor();

    @Test(dataProvider = "seeColorDataProvider")
    void seeColorTest(String str, String excepted) {

        assertEquals(seeColor.seeColor(str), excepted);

    }

    @DataProvider(name = "seeColorDataProvider")
    public String[][] seeColorDataProvider() {
        return new String[][]{

                {"a", ""},
                {"xyzred", ""},
                {"", ""},
                {"red", "red"},
                {"blueTimes", "blue"},
                {"xxred", ""},
                {"redxx", "red"},
        };
    }
}