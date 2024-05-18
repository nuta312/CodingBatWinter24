package meerimMac.string1;

import com.digital_nomads.meerimMac.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwoTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"Hello", "He"},
                {"aaa", "aa"},
                {"ab", "ab"},
                {"Kitten", "Ki"},
                {"hiya", "hi"},
                {"", ""}
        };

    }

    @Test(dataProvider = "word")
    public void firstTwo(String some, String expected) {
        FirstTwo f = new FirstTwo();
        String actual = f.firstTwo(some);
        Assert.assertEquals(actual, expected);
    }

}

