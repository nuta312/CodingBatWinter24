package almaz.string1_test;

import com.digital_nomads.almaz.string1.ConCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCatTest {
    @Test(dataProvider = "ConCatTest")
    public void testConCat(String a, String b, String expect) {
        ConCat conCat = new ConCat();
        String result = conCat.conCat(a, b);
        Assert.assertEquals(result, expect);
    }

    @DataProvider
    public Object[][] ConCatTest() {
        return new Object[][]{
                {"abc", "cat", "abcat"},
                {"dog", "cat", "dogcat"},
                {"abc", "", "abc"},
                {"", "cat", "cat"},
                {"pig", "g", "pig"},
                {"pig", "doggy", "pigdoggy"},

        };
    }
}

