package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.WithoutEnd2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEnd2Test {
    @Test(dataProvider = "end2Provider")
    public void testWithoutEnd2(String str, String expected) {
        Assert.assertEquals(WithoutEnd2.withoutEnd2(str), expected);
    }

    @DataProvider
    public Object[][] end2Provider() {
        return new Object[][]{
                {"Hello", "ell"},
                {"abc", "b"},
                {"a", ""},
                {"coldy", "old"}
        };

    }
}
