package aijan.string1_test;

import com.digital_nomads.aijan.string1.MiddleTwo;
import com.digital_nomads.aijan.string1.NTwice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NTwiceTestTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"Hello", 2, "Helo"},
                {"Chocolate", 3, "Choate"},
                {"Chocolate", 1, "Ce"},
                {"Chocolate", 0, ""},
                {"Hello", 4, "Hellello"},
                {"Code", 4,  "CodeCode"},
                {"Code", 2, "Code"}
        };

    }

    @Test(dataProvider = "word")
    public void testNonStart(String str, int n, String expectedResult) {
        NTwice obj = new NTwice();
        String actualResult = obj.nTwice(str, n);
        Assert.assertEquals(actualResult,expectedResult);
    }

}