package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.StringE;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringETest {
    @Test(dataProvider = "stringEDP")
    public void testStringE(String str, boolean excepted) {
        StringE se = new StringE();
        assertEquals(se.stringE(str), excepted);
    }

    @DataProvider(name = "stringEDP")
    public Object[][] stringEDP() {
        return new Object[][]{{"Hello", true},
                {"Heelle", true},
                {"Heelele", false},
                {"Hll", false},
                {"e", true},
                {"", false}};
    }

}