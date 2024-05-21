package nuraiym.string1_test;

import com.digital_nomads.nuraiym.string1.nTwice;
import com.digital_nomads.nuraiym.string1.nTwice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class nTwiceTest {
    @Test(dataProvider = "nTwiceDataProvider")
    public void testNTwice(String str, int n, String expected) {
        nTwice nTwice = new nTwice();
        String result = nTwice.nTwice(str, n);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "nTwiceDataProvider")
    public Object[][] nTwiceDataProvider() {
        return new Object[][]{
                {"Hello", 2, "Helo"},
                {"Chocolate", 3, "Choate"},
                {"Chocolate", 1, "Ce"},
                {"Chocolate", 0, ""},
                {"Hello", 4, "Hellello"},
                {"Code", 4, "CodeCode"},
                {"Code", 2, "Code"}
        };
    }
}
