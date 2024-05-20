package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleThreeTest {

    @Test(dataProvider = "middleThreeDataProvider")
    public void middleThreeTest(String str, String expected){
        MiddleThree middleThree = new MiddleThree();
        Assert.assertEquals(middleThree.middleThree(str), expected);
    }

    @DataProvider(name = "middleThreeDataProvider")
    public Object[][] middleThreeDataProvider() {
        return new Object[][]{
                {"Candy", "and"},
                {"and", "and"},
                {"solving", "lvi"},
                {"Hi yet Hi", "yet"},
                {"Chocolate", "col"},
                {"XabcxyzabcX", "xyz"}
        };
    }
}
