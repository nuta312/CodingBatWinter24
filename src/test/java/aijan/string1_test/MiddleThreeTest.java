package aijan.string1_test;

import com.digital_nomads.aijan.string1.MiddleThree;
import com.digital_nomads.aijan.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MiddleThreeTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"Candy","and"},
                {"and","and"},
                {"solving","lvi"},
                {"Hi yet Hi","yet"},
                {"java yet java","yet"},
                {"Chocolate","col"},
                {"XabcxyzabcX","xyz"},

        };

    }

    @Test(dataProvider = "word")
    public void testMiddleThree(String str, String expectedResult) {
        MiddleThree obj = new MiddleThree();
        String actualResult = obj.middleThree(str);
        Assert.assertEquals(actualResult,expectedResult);
    }


}