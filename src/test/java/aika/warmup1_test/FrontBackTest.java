package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.FrontBack;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrontBackTest {
    @Test(dataProvider = "frontBackDP")
    public void testFrontBack(String str, String excepted) {
        FrontBack fb = new FrontBack();
        assertEquals(fb.frontBack(str), excepted);
    }

    @DataProvider(name = "frontBackDP")
    public Object[][] frontBackDP() {
        return new Object[][]{{"code", "eodc"},
                {"a", "a"},
                {"ab", "ba"},
                {"abc", "cba"},
                {"", ""},
                {"Chocolate", "ehocolatC"},
                {"aavJ", "Java"},
                {"hello", "oellh"}};
    }

}