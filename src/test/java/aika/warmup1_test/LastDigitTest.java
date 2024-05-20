package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.LastDigit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LastDigitTest {
    @Test(dataProvider = "lastDigitDP")
    public void testLastDigit(int a, int b, boolean excepted) {
        LastDigit ld = new LastDigit();
        assertEquals(ld.lastDigit(a, b), excepted);
    }

    @DataProvider(name = "lastDigitDP")
    public Object[][] lastDigitDP() {
        return new Object[][]{{7, 17, true},
                {6, 17, false},
                {3, 113, true},
                {114, 113, false},
                {114, 4, true},
                {10, 0, true},
                {11, 0, false}};
    }
}