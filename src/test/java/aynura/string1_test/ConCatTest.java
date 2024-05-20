package aynura.string1_test;

import com.digital_nomads.aijan.string1.ConCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCatTest {

    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"abc", "cat","abcat"},
                {"dog", "cat","dogcat"},
                {"abc", "", "abc"},
                {"", "cat", "cat"},
                {"pig", "g", "pig"},
                {"pig", "doggy","pigdoggy"}
        };
    }

    @Test(dataProvider = "word")
    public void testConCat(String a, String b, String expectedResult) {
        ConCat obj = new ConCat();
        String actualResult = obj.conCat(a,b);

        Assert.assertEquals(actualResult,expectedResult);
    }
}
