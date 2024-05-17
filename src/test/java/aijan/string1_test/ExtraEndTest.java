package aijan.string1_test;

import com.digital_nomads.aijan.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {
    @DataProvider(name = "words")
    public Object [][] provideWords() {
        return new Object[][] {
                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Hi", "HiHiHi"},
                {"Candy", "dydydy"},
                {"Code", "dedede"},
        };
    }

    @Test(dataProvider = "words")
    public void TestExtraEnd(String str, String expectedResult) {
        ExtraEnd obj = new ExtraEnd();
        String actualResult = obj.extraEnd(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
