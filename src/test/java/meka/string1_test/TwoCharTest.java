package meka.string1_test;

import com.digital_nomads.meka.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoCharTest {

    @Test(dataProvider = "testData")
    public void testTwoChar(String str, int index, String expected) {
        TwoChar twoChar = new TwoChar();
        String result = twoChar.twoChar(str, index);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Hello", 0, "He"},
                {"Hello", 1, "el"},
                {"Hello", 99, "He"},
                {"Hello", 3, "lo"},
                {"Hello", 4, "He"},
                {"Hello", 5, "He"},
                {"Hello", -1, "He"},
                {"java", 0, "ja"},
                {"java", 2, "va"},
                {"java", 3, "ja"},
                {"java", 4, "ja"}
        };
    }
}
