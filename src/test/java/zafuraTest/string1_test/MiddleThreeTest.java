package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.MiddleThree;
import com.digital_nomads.zafura.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleThreeTest {
    @Test(dataProvider = "middle")
    public void testMiddleThree(String str,  String expected) {
        MiddleThree middleThree= new MiddleThree();
        Assert.assertEquals(middleThree.middleThree(str), expected);
    }

    @DataProvider
    public Object[][] middle() {

        return new Object[][]{
                {"Candy", "and"},
                {"and", "and"},
                {"XabcxyzabcX", "xyz"},
        };
    }
}
