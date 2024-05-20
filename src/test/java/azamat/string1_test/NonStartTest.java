package azamat.string1_test;

import com.digital_nomads.azamat.string1.NonStart;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class NonStartTest {

    @Test(dataProvider = "nonStartDataProvider")
    public void testNonStart(String a, String b, String expected) {
        NonStart nonStart = new NonStart();
        assertEquals(nonStart.nonStart(a, b), expected);
    }

    @DataProvider
    public Object[][] nonStartDataProvider() {
        return new Object[][]{
                {"Hello", "hi", "elloi"},
                {"abcdef", "123", "bcdef23"},
                {"Hi", "Hello", "iello"},
                {"x", "xyz", "yz"},
                {"1234", "x", "234"},
                {"xyz", "abc", "yzbc"}
        };
    }
}
