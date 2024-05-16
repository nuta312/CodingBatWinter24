package meka.string1_test;

import com.digital_nomads.meka.string1.AtFirst;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtFirstTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"hello", "he"},
                {"hi", "hi"},
                {"h", "h@"},
                {"", "@@"},
                {"kitten", "ki"},
                {"java", "ja"},
                {"j", "j@"}
        };
    }

    @Test(dataProvider = "testData")
    public void testAtFirst(String str, String expected) {
        AtFirst atFirst = new AtFirst();
        String result = atFirst.atFirst(str);
        Assert.assertEquals(result, expected);
    }


}
