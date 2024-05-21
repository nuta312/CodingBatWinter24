package nuraiym.string1_test;

import com.digital_nomads.nuraiym.string1.EndsLy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndsLyTest {
    @Test(dataProvider = "endsLyDataProvider")
    public void testEndsLy(String str, boolean expected) {
        EndsLy endsLy = new EndsLy();
        boolean result = endsLy.endsLy(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "endsLyDataProvider")
    public Object[][] endsLyDataProvider() {
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
}
