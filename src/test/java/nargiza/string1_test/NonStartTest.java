package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.NonStart;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NonStartTest {

    NonStart nonStart = new NonStart();

    @DataProvider(name = "getNonStart")
    public Object[][] getNonStart(){
        return new Object[][]{
                {"Hello", "There", "ellohere"},
                {"java", "code", "avaode"},
                {"shotl", "java", "hotlava"}
        };
    }

    @Test(dataProvider = "getNonStart")
    public void testNonStart(String a, String b, String expected){
        String result = nonStart.nonStart(a, b);
        assertEquals(result, expected);
    }

}