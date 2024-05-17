package meka.string1_test;

import com.digital_nomads.meka.string1.EndsLy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndsLyTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"oddly", true},
                {"y", false},
                {"oddy", false},
                {"oddl", false},
                {"olydd", false},
                {"ly", true},
                {"", false},
                {"falsey", false},
                {"evenly", true}
        };
    }

    @Test(dataProvider = "testData")
    public void testEndsLy(String str, boolean expected) {
        EndsLy endsLy = new EndsLy();
        boolean result = endsLy.endsLy(str);
        Assert.assertEquals(result, expected);
    }
}
