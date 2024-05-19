package azamat.string1_test;

import com.digital_nomads.azamat.string1.NTwice;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class NTwiceTest {

    @Test(dataProvider = "nTwiceDataProvider")
    public void testNTwice(String str, int n, String expected) {
        NTwice nTwice = new NTwice();
        assertEquals(nTwice.nTwice(str, n), expected);
    }

    @DataProvider
    public Object[][] nTwiceDataProvider() {
        return new Object[][]{
                {"Hello", 2, "Helo"},
                {"abcdef", 3, "abcdef"},
                {"Hi", 1, "Hi"},
                {"", 0, ""},
                {"1234", 2, "1234"},
                {"xyz", 1, "xz"},
                {"abcde", 0, ""}
        };
    }
}
