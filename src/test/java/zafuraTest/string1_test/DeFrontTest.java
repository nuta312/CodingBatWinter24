package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.DeFront;
import com.digital_nomads.zafura.string1.WithoutTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeFrontTest {
    @Test(dataProvider = "front")
    public void testDeFront(String str,  String expected) {
        DeFront deFront = new DeFront();
        Assert.assertEquals(deFront.deFront(str), expected);
    }

    @DataProvider
    public Object[][] front() {

        return new Object[][]{
                {"Hello", "llo"},
                {"java","va"},
                {"ax", "a"},
        };
    }
}
