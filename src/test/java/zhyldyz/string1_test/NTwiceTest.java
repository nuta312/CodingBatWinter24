package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.NTwice;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NTwiceTest {

    NTwice nTwice = new NTwice();

    @Test(dataProvider = "nTwiceDataProvider")
    void nTwiceTest(String str, Integer n, String excepted) {

        assertEquals(nTwice.nTwice(str, n), excepted);

    }

    @DataProvider(name = "nTwiceDataProvider")
    public Object[][] nTwiceDataProvider() {
        return new Object[][]{

                {"Hello", 2, "Helo"},
                {"Chocolate", 3, "Choate"},
                {"Chocolate", 1, "Ce"},
                {"Chocolate", 0, ""},
                {"Hello", 4, "Hellello"},
                {"Code", 4, "CodeCode"},
                {"Code", 2, "Code"}
        };
    }
}