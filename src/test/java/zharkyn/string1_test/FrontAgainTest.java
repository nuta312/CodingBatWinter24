package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.FrontAgain;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontAgainTest {

    @Test(dataProvider = "frontAgainDataProvider")
    public void frontAgainTest(String str, boolean expected){
        FrontAgain frontAgain = new FrontAgain();
        Assert.assertEquals(frontAgain.frontAgain(str), expected);
    }

    @DataProvider(name = "frontAgainDataProvider")
    public Object[][] frontAgainDataProvider() {
        return new Object[][]{
                {"edited", true},
                {"edit", false},
                {"ed", true},
                {"jj", true},
                {"jjj", true},
                {"jjjj", true},
                {"jjjk", false},
                {"x", false},
                {"", false},
                {"java", false},
                {"javaja", true}
        };
    }
}
