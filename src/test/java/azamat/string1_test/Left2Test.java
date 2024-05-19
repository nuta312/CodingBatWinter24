package azamat.string1_test;

import com.digital_nomads.azamat.string1.Left2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Left2Test {

    @Test(dataProvider = "left2DataProvider")
    public void testLeft2(String str, String expected) {
        Left2 left2 = new Left2();
        assertEquals(left2.left2(str), expected);
    }

    @DataProvider
    public Object[][] left2DataProvider() {
        return new Object[][]{
                {"Hello", "lloHe"},
                {"abcdef", "cdefab"},
                {"Hi", "Hi"},
                {"Chocolate", "ocolateCh"},
                {"1234", "3412"},
                {"bricks", "icksbr"},
        };
    }
}

