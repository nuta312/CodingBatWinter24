package aidaTests.string1_test;

import com.digital_nomads.aida.string1.NonStart;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NonStartTest {

    @Test(dataProvider = "provider")
    public void testNonStart(String a, String b, String expectedResult){
        NonStart nonStart = new NonStart();
        Assert.assertEquals(nonStart.nonStart(a, b), expectedResult);
    }

    @DataProvider
    public Object [][] provider(){
        return new Object[][]{
                {"Hello", "There", "ellohere"},
                {"java", "code", "avaode"},
                {"shotl", "java", "hotlava"},
                {"ab", "xy", "by"},
                {"ab", "x", "b"},
                {"x", "ac", "c"},
                {"a", "x", ""},
                {"kit", "kat", "itat"},
                {"mart", "dart", "artart"}
        };
    }
}
