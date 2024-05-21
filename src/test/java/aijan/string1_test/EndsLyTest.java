package aijan.string1_test;

import com.digital_nomads.aijan.string1.EndsLy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndsLyTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
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

    @Test(dataProvider = "word")
    public void testNonStart(String str, boolean expectedResult) {
        EndsLy obj = new EndsLy();
        boolean actualResult = obj.endsLy(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
