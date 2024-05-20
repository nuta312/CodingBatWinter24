package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.Front3;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Front3Test {
    @Test(dataProvider = "front3DP")
    public void testFront3(String str, String excepted) {
        Front3 f3 = new Front3();
        assertEquals(f3.front3(str), excepted);
    }

    @DataProvider(name = "front3DP")
    public Object[][] front3DP() {
        return new Object[][]{{"Java", "JavJavJav"},
                {"Chocolate", "ChoChoCho"},
                {"abc", "abcabcabc"},
                {"abcXYZ", "abcabcabc"},
                {"ab", "ababab"},
                {"a", "aaa"},
                {"", ""}};
    }
}