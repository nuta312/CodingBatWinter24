package aijan.string1_test;

import com.digital_nomads.aijan.string1.MiddleThree;
import com.digital_nomads.aijan.string1.SeeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SeeColorTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"redxx","red"},
                {"xxred",""},
                {"blueTimes","blue"},
                {"NoColor",""},
                {"red","red"},
                {"re",""},
                {"blu",""},
                {"blue","blue"},
                {"a",""},
                {"",""},
                {"xyzred",""}

        };

    }

    @Test(dataProvider = "word")
    public void testSeeColor(String str, String expectedResult) {
        SeeColor obj = new SeeColor();
        String actualResult = obj.seeColor(str);
        Assert.assertEquals(actualResult,expectedResult);
    }



}