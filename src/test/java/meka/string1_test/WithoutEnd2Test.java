package meka.string1_test;

import com.digital_nomads.meka.string1.WithoutEnd2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEnd2Test {

    @Test(dataProvider = "testData")
    public void testWithoutEnd2(String str, String expected) {
        WithoutEnd2 withoutEnd2 = new WithoutEnd2();
        String result = withoutEnd2.withouEnd2(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Hello", "ell"},
                {"ab", ""},
                {"a", ""},
                {"", ""},
                {"coldy", "old"},
                {"abc", "b"},
                {"java code", "ava cod"}
        };
    }
}
