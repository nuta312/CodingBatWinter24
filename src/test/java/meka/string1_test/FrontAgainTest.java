package meka.string1_test;

import com.digital_nomads.meka.string1.FrontAgain;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontAgainTest {

    @Test(dataProvider = "testData")
    public void testFrontAgain(String str, boolean expected){
        FrontAgain frontAgain = new FrontAgain();
        boolean result = frontAgain.frontAgain(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
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
