package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.WithoutEnd2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WithoutEnd2Test {

    WithoutEnd2 withoutEnd2 = new WithoutEnd2();

    @Test(dataProvider = "withoutEnd2DataProvider")
    void withoutEnd2Test(String str, String exception) {

        assertEquals(withoutEnd2.withouEnd2(str), exception);
    }

    @DataProvider(name = "withoutEnd2DataProvider")
    public String[][] withoutEnd2DataProvider() {

        return new String[][]{

                {"Hello", "ell"},
                {"abc", "b"},
                {"ab", ""},
                {"a", ""},
                {"a", ""},
                {"", ""},
                {"coldy", "old"},
                {"java code", "ava cod"},
        };
    }

}