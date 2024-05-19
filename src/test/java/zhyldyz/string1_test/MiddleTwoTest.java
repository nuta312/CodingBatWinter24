package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.MiddleTwo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MiddleTwoTest {

    @Test(dataProvider = "middleTwoDataProvider")
    public void middleTwoTest(String str, String expected) {

        var middleTwo = new MiddleTwo();
        assertEquals(middleTwo.middleTwo(str), expected);

    }

    @DataProvider(name = "middleTwoDataProvider")
    public String[][] middleTwoDataProvider() {
        return new String[][]{
                {"string", "ri"},
                {"Practice", "ct"},
                {"ab", "ab"},
                {"0123456789", "45"},
                {"code", "od"},
        };
    }

}