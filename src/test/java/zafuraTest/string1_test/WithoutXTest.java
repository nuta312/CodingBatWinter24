package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.StartWord;
import com.digital_nomads.zafura.string1.WithoutX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutXTest {
    @Test(dataProvider = "with")
    public void testWithoutX(String str,  String expected) {
        WithoutX withoutX = new WithoutX();
        Assert.assertEquals(withoutX.withoutX(str), expected);
    }

    @DataProvider
    public Object[][] with() {

        return new Object[][]{
                {"xHix", "Hi"},
                {"Hi", "Hi"},
                {"xaxbx","axb"},
        };
    }
}
