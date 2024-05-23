package zhyldyz.warmap1_test;

import com.digital_nomads.zhyldyz.warmap1.MissingChar;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MissingCharTest {

    MissingChar missingChar = new MissingChar();

    @DataProvider(name = "missingCharTest")
    public Object[][] missingCharDtaProvider() {

        return new Object[][]{

                {"kitten", 1, "ktten"},
                {"kitten", 0, "itten"},
                {"kitten", 4, "kittn"},
                {"Hi", 0, "i"},
                {"Hi", 1, "H"},
                {"code", 0, "ode"},
                {"code", 1, "cde"},
                {"code", 2, "coe"},
                {"code", 3, "cod"}
        };
    }

    @Test(dataProvider = "missingCharTest")
    void missingChar(String str, int n, String expected) {

        assertEquals(missingChar.missingChar(str, n), expected);

    }

}