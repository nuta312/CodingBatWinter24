package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.ComboString;
import com.digital_nomads.zafura.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStartTest {
    @Test(dataProvider = "start")
    public void testComboString(String a,String b, String expected) {
        NonStart nonStart = new NonStart();
        Assert.assertEquals(nonStart.nonStart(a,b),expected);
    }
    @DataProvider
    public Object[][]start(){
        return new Object[][]{
                {"Hello", "There","ellohere"},
                {"java", "code", "avaode" },
                {"shotl", "java","hotlava"},
                {"ab", "xy", "by"},
                {"ab", "x","b"},

        };
    }
}


