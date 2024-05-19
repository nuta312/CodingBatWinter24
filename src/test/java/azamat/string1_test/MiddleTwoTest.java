package azamat.string1_test;

import com.digital_nomads.azamat.string1.MiddleTwo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class MiddleTwoTest {

    @Test(dataProvider = "middleTwoDataProvider")
    public void testMiddleTwo(String str, String expected) {
        MiddleTwo middleTwo = new MiddleTwo();
        assertEquals(middleTwo.middleTwo(str), expected);
    }

    @DataProvider
    public Object[][] middleTwoDataProvider() {
        return new Object[][]{
                {"Hello", "el"},
                {"abcdef", "cd"},
                {"Hi", "Hi"},
                {"1234", "23"},
                {"xyza", "yz"},
                {"12345", "23"}
        };
    }
}
