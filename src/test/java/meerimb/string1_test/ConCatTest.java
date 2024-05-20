package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.ConCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCatTest {

    ConCat conCat = new ConCat();

    @Test(dataProvider = "conCat")
    public void testConCat(String a, String b, String expected) {

        Assert.assertEquals(conCat.conCat(a, b), expected);
    }

    @DataProvider
    public Object[][] conCat() {
        return new Object[][]{
                {"abc", "cat", "abcat"},
                {"dog", "cat", "dogcat"},
                {"abc", "", "abc"},
                {"", "cat", "cat"},
                {"pig", "g", "pig"},
                {"pig", "doggy", "pigdoggy"}
        };
    }
}
