package meka.string1_test;

import com.digital_nomads.meka.string1.Right2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Right2Test {

    @Test(dataProvider = "testData")
    public void testRight2(String str, String expected) {
        Right2 right2 = new Right2();
        String result = right2.right2(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Hello", "loHel"},
                {"Java", "vaJa"},
                {"Code", "deCo"},
                {"cat", "atc"},
                {"Hi", "Hi"},
                {"12345", "45123"}
        };
    }
}
