package aijan.string1_test;

import com.digital_nomads.aijan.string1.Left2;
import com.digital_nomads.aijan.string1.Right2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Right2Test {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"Hello", "loHel"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code", "deco"},
                {"cat", "atc"},
                {"12345", "45123"}
        };

    }

    @Test(dataProvider = "word")
    public void testNonStart(String str, String expectedResult) {
        Right2 obj = new Right2();
        String actualResult = obj.right2(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
