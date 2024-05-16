package aijan.string1_test;

import com.digital_nomads.aijan.string1.NTwice;
import com.digital_nomads.aijan.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TwoCharTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"java", 0, "ja"},
                {"java", 2, "va"},
                {"java", 3, "ja"},
                {"java", 4, "ja"},
                {"java", -1, "ja"},
                {"Hello", 0, "He"},
                {"Hello", 1, "el"},
                {"Hello", 99, "He"},
                {"Hello", 3, "lo"},
                {"Hello", 4, "He"},
                {"Hello", 5, "He"},
                {"Hello", -7, "He"},
                {"Hello", 6, "He"},
                {"Hello", -1, "He"},
                {"yay", 0, "ya"}
        };

    }

    @Test(dataProvider = "word")
    public void testTwoChar(String str, int index, String expectedResult) {
        TwoChar obj = new TwoChar();
        String actualResult = obj.twoChar(str, index);
        Assert.assertEquals(actualResult,expectedResult);
    }

}