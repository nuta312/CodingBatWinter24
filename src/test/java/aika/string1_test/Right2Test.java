package aika.string1_test;

import com.digital_nomads.aika.string1.Right2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Right2Test {
    @Test(dataProvider = "right2DP")
    public void testRight2(String str, String except) {
        Right2 r2 = new Right2();
        assertEquals(r2.right2(str), except);
    }

    @DataProvider(name = "right2DP")
    public String[][] right2DP() {
        return new String[][]{{"Hello", "loHel"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code", "deco"},
                {"cat", "atc"},
                {"12345", "45123"}};
    }
}