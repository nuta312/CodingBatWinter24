package aijan.string1_test;

import com.digital_nomads.aijan.string1.HasBad;
import com.digital_nomads.aijan.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HasBadTest {
    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"badxx", true},
                {"xbadxx", true},
                {"xxbadxx", false},
        {"code",false},
                {"bad",true},
        {"ba",false},
            {"xba", false},
                {"xbad", true},
                    {"", false},
        {"badyy",true}

        };

    }

    @Test(dataProvider = "word")
    public void testHasBad(String str, boolean expectedResult) {
        HasBad obj = new HasBad();
        boolean actualResult = obj.hasBad(str);
        Assert.assertEquals(actualResult,expectedResult);
    }



}