package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.HasBed;
import com.digital_nomads.zafura.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasBedTest {
    @Test(dataProvider = "has")
    public void testHasBed(String str,  boolean expected) {
        HasBed hasBed= new HasBed();
        Assert.assertEquals(hasBed.hasBad(str), expected);
    }

    @DataProvider
    public Object[][] has() {

        return new Object[][]{
                {"badxx", true},
                {"xxbadxx", false},
                {"",false},
        };
    }
}
