package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.MissingChar;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MissingCharTest {
    @Test(dataProvider = "missingCharDP")
    public void testMissingChar(String str, int n, String excepted) {
        MissingChar mch = new MissingChar();
        assertEquals(mch.missingChar(str, n), excepted);

    }

    @DataProvider(name = "missingCharDP")
    public Object[][] missingCharDP() {
        return new Object[][]{{"kitten", 1, "ktten"},
                {"kitten", 0, "itten"},
                {"kitten", 4, "kittn"},
                {"Hi", 0, "i"},
                {"Hi", 1, "H"},
                {"code", 0, "ode"},
                {"code", 1, "cde"},
                {"code", 2, "coe"},
                {"code", 3, "cod"},
                {"chocolate", 8, "chocolat"}};
    }

}