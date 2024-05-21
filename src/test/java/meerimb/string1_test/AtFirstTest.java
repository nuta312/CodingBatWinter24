package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.AtFirst;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtFirstTest {

    AtFirst atFirst = new AtFirst();

    @Test(dataProvider = "atFirst")
    public void testAtFirst(String str, String expected) {

        Assert.assertEquals(atFirst.atFirst(str), expected);
    }

    @DataProvider
    public Object[][] atFirst() {
        return new Object[][]{
                {"hello", "he"},
                {"hi", "hi"},
                {"h", "h@"},
                {"", "@@"},
                {"kitten", "ki"},
                {"java", "ja"},
                {"j", "j@"}
        };
    }
}
