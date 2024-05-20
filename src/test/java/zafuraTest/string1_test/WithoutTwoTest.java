package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.ExtraFront;
import com.digital_nomads.zafura.string1.WithoutTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutTwoTest {
    @Test(dataProvider = "with")
    public void testWithoutTwo(String str,  String expected) {
        WithoutTwo withoutTwo = new WithoutTwo();
        Assert.assertEquals(withoutTwo.without2(str), expected);
    }

    @DataProvider
    public Object[][] with() {

        return new Object[][]{
                {"HelloHe", "lloHe"},
                {"Hi",""},
                {"xx",""},
        };
    }
}
