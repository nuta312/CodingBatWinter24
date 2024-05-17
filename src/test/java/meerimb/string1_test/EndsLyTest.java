package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.EndsLy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndsLyTest {
    EndsLy endsLy = new EndsLy();

    @Test(dataProvider = "endsLy")
    public void testEndsLy(String str, boolean expected) {

        Assert.assertEquals(endsLy.endsLy(str), expected);
    }

    @DataProvider
    public Object[][] endsLy() {
        return new Object[][]{
                {"oddly", true},
                {"y", false},
                {"oddy", false},
                {"oddl", false},
                {"ly", true},
                {"", false},
                {"falsey", false},
                {"evenly", true}
        };
    }
}
