package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.EveryNth;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EveryNthTest {
    @Test(dataProvider = "evereNth")
    public void testEveryNth(String str, int n, String excepted) {
        EveryNth en = new EveryNth();
        assertEquals(en.everyNth(str, n), excepted);
    }

    @DataProvider(name = "evereNth")
    public Object[][] evereNth() {
        return new Object[][]{{"Miracle", 2, "Mrce"},
                {"abcdefg", 2, "aceg"},
                {"abcdefg", 3, "adg"},
                {"Chocolate", 3, "Cca"},
                {"Chocolates", 3, "Ccas"},
                {"Chocolates", 4, "Coe"},
                {"Chocolates", 100, "C"}};
    }

}