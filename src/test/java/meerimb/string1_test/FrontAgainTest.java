package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.FrontAgain;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontAgainTest {

    FrontAgain frontAgain = new FrontAgain();

    @Test(dataProvider = "frontAgain")
    public void testFrontAgain(String str, boolean expected) {

        Assert.assertEquals(frontAgain.frontAgain(str), expected);
    }

    @DataProvider
    public Object[][] frontAgain() {
        return new Object[][]{
                {"edited", true},
                {"edit", false},
                {"ed", true},
                {"jj", true},
                {"jjj", true},
                {"jjjj", true},
                {"jjjjk", false},
                {"x", false},
                {"", false},
                {"java", false},
                {"javaja", true},
        };
    }
}

