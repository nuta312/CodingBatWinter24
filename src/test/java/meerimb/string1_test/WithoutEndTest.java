package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEndTest {
    WithoutEnd withoutEnd = new WithoutEnd();

    @Test(dataProvider = "withoutEnd")
    public void testWithoutEnd(String str, String expected) {

        Assert.assertEquals(withoutEnd.withoutEnd(str), expected);
    }

    @DataProvider
    public Object[][] withoutEnd() {
        return new Object[][]{
                {"Hello", "ell"},
                {"java", "av"},
                {"coding", "odin"},
                {"Hello", "ell"},
                {"ab", ""},
                {"Chocolate!", "hocolate"},
                {"kitten", "itte"},
                {"woohoo", "ooho"},
        };
    }
}
