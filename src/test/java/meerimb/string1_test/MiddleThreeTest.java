package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleThreeTest {

    MiddleThree middleThree = new MiddleThree();

    @Test(dataProvider = "middleThree")
    public void testMiddleThree(String str, String expected) {

        Assert.assertEquals(middleThree.middleThree(str), expected);
    }

    @DataProvider
    public Object[][] middleThree() {
        return new Object[][]{
                {"Candy","and"},
                {"and","and"},
                {"solving","lvi"},
                {"Hi yet Hi","yet"},
                {"java yet java","yet"},
                {"Chocolate","col"},
                {"XabcxyzabcX","xyz"}
        };
    }
}
