package meka.string1_test;

import com.digital_nomads.meka.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleThreeTest {

    @Test(dataProvider = "testData")
    public void testMiddleThree(String str, String expected) {
        MiddleThree middleThree = new MiddleThree();
        String result = middleThree.middleThree(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Candy", "and"},
                {"and", "and"},
                {"solving", "lvi"},
                {"Hi yet Hi", "yet"},
                {"java yet java", "yet"},
                {"Chocolate", "col"},
                {"XabcxyzabcX", "xyz"}
        };
    }

}
