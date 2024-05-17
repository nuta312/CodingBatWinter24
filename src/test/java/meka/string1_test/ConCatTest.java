package meka.string1_test;

import com.digital_nomads.meka.string1.ConCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCatTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"abc", "cat", "abcat"},
                {"dog", "cat", "dogcat"},
                {"abc", "", "abc"},
                {"", "cat", "cat"},
                {"pig", "g", "pig"},
                {"pig", "doggy", "pigdoggy"}
        };
    }

    @Test(dataProvider = "testData")
    public void testConCat(String a, String b, String expected) {
        ConCat conCat = new ConCat();
        String result = conCat.conCat(a, b);
        Assert.assertEquals(result, expected);
    }

}
