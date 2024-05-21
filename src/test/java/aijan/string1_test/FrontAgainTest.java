package aijan.string1_test;

import com.digital_nomads.aijan.string1.FrontAgain;
import com.digital_nomads.aijan.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrontAgainTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"edited",true},
                {"edit",false},
                {"ed",true},
        {"jj",true},
                {"jjj",true},
        {"jjjj",true},
            {"jjjk",false},
                {"x",false},
                    {"",false},
                        {"java",false},
                            {"javaja",true},

        };

    }

    @Test(dataProvider = "word")
    public void testFrontAgain(String str, boolean expectedResult) {
        FrontAgain obj = new FrontAgain();
        boolean actualResult = obj.frontAgain(str);
        Assert.assertEquals(actualResult,expectedResult);
    }



}