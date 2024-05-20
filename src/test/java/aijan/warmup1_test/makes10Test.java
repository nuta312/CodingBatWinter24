package aijan.warmup1_test;

import com.digital_nomads.aika.warmup1.Makes10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class makes10Test {
    @DataProvider(name = "data")
    public Object[][] provideData() {
        return new Object[][]{
                {9, 10, true},
                {9, 9, false},
                {1, 9, true},
                {10, 1, true},
                {10, 10, true},
                {8, 2, true},
                {8, 3, false},
                {10, 42, true},
                {12, -2, true}
        };
    }

    @Test(dataProvider = "data")
    public void testmakes10(int a, int b, boolean expected) {
        Makes10 obj = new Makes10();
        boolean actual = obj.makes10(a, b);
        Assert.assertEquals(actual, expected);
    }


}