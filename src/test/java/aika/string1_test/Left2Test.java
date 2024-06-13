package aika.string1_test;

import com.digital_nomads.aika.string1.Left2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Left2Test {
    @Test(dataProvider = "left2DP")
    public void testLeft2(String str, String except) {
        Left2 l2 = new Left2();
        assertEquals(l2.left2(str), except);

    }

    @DataProvider(name = "left2DP")
    public String[][] left2DP() {
        return new String[][]{{"Hello", "lloHe"},
                {"Hi", "Hi"},
                {"code", "deco"},
                {"cat", "tca"},
                {"Chocolate", "ocolateCh"},
                {"bricks", "icksbr"}};
    }
}