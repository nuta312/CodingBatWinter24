package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.WithoutX;
import com.digital_nomads.zafura.string1.WithoutXTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutXTwoTest {
    @Test(dataProvider = "withx")
    public void testWithoutXTwo(String str,  String expected) {
        WithoutXTwo withoutXTwo = new WithoutXTwo();
        Assert.assertEquals(withoutXTwo.withoutX2(str), expected);
    }

    @DataProvider
    public Object[][] withx() {

        return new Object[][]{
                {"xHi","Hi"},
                {"Hi","Hi"},
                {"xxHi", "Hi"},
        };
    }
}
