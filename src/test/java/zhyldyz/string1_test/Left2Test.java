package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.Left2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Left2Test {

    Left2 left2 = new Left2();

    @Test(dataProvider = "left2DataProvider")
    void left2Test(String str, String expected) {

        assertEquals(left2.left2(str), expected);

    }

    @DataProvider(name = "left2DataProvider")
    public String[][] left2DataProvider() {

        return new String[][]{

                {"Hello", "lloHe"},
                {"java", "vaja"},
                {"cat", "tca"},
                {"Hi", "Hi"},
                {"12345", "34512"},

        };
    }

}