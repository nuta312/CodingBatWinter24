package aijan.string1_test;

import com.digital_nomads.aijan.string1.LastTwo;
import com.digital_nomads.aijan.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LastTwoTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"coding","codign"},
                {"cat","cta"},
                {"ab","ba"},
                {"a","a"},
                {"",""}
        };

    }

    @Test(dataProvider = "word")
    public void testLastTwo(String str, String expectedResult) {
        LastTwo obj = new LastTwo();
        String actualResult = obj.lastTwo(str);
        Assert.assertEquals(actualResult,expectedResult);
    }



}