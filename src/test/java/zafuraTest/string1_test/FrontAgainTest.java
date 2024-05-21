package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.FrontAgain;
import com.digital_nomads.zafura.string1.SeeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrontAgainTest {
    @Test(dataProvider = "front")
    public void testFrontAgain(String str,  boolean expected) {
        FrontAgain frontAgain = new FrontAgain();
        Assert.assertEquals(frontAgain.frontAgain(str), expected);
    }

    @DataProvider
    public Object[][] front() {

        return new Object[][]{
                {"edited", true},
                {"edit", false},
                {"",false},
        };
    }
}

