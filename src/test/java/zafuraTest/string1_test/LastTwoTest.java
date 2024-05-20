package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.ConCat;
import com.digital_nomads.zafura.string1.LastTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastTwoTest {
    @Test(dataProvider = "last")
    public void testLastTwo(String str,  String expected) {
        LastTwo lastTwo = new LastTwo();
        Assert.assertEquals(lastTwo.lastTwo(str), expected);
    }

    @DataProvider
    public Object[][] last() {

        return new Object[][]{
                {"coding","codign"},
                {"cat","cta"},
                {"",""},
        };
    }
}
