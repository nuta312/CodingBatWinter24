package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.Without2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Without2Test {

    Without2 without2 = new Without2();

    @Test(dataProvider = "without2DataProvider")
    void without2Test(String str, String exception) {

        assertEquals(without2.without2(str), exception);

    }

    @DataProvider(name = "without2DataProvider")
    public String[][] without2DataProvider() {

        return new String[][]{

                {"Hi", ""},
                {"HelloHi", "HelloHi"},
                {"Chocolate", "Chocolate"},
                {"xxx", "x"},
                {"xx", ""},
                {"x", "x"},
                {"", ""},
                {"Fruits", "Fruits"}
        };
    }
}