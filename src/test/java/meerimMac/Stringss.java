package meerimMac;

import com.digital_nomads.meerimMac.CondingBat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Stringss {

    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"meku", "Hello meku!"},
                {"aaa", "Hello aaa!"},
                {"a", "Hello a!"},

        };

    }

    @Test(dataProvider = "word")
    public void stringTest1(String some, String expected) {
        String actual = CondingBat.helloName(some);
        Assert.assertEquals(actual, expected);
    }

}
