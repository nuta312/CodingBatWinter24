package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.ConCat;
import com.digital_nomads.zafura.string1.LastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCatTest {
    @Test(dataProvider = "concat")
    public void testConcat(String a,String b,  String expected) {
        ConCat conCat = new ConCat();
        Assert.assertEquals(conCat.conCat(a,b), expected);
    }

    @DataProvider
    public Object[][] concat() {

        return new Object[][]{
                {"abc", "cat", "abcat"},
                {"dog", "cat", "dogcat"},
                {"pig", "doggy","pigdoggy"},
        };
    }
}
