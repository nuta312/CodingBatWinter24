package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.Right2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Right2Test {

    Right2 right2 = new Right2();

    @Test(dataProvider = "right2DataProvider")
    void right2Test(String str, String excepted) {
        assertEquals(right2.right2(str), excepted);
    }

    @DataProvider(name = "right2DataProvider")
    public String[][] right2DataProvider() {
        return new String[][]{
                {"Hello", "loHel"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code", "deco"},
                {"cat", "atc"},
                {"12345", "45123"}
        };
    }
}