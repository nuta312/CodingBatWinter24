package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.DeFront;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DeFrontTest {

    @Test(dataProvider = "deFrontDataProvider")
    public void deFrontTest(String str, String expected) {

        DeFront deFront = new DeFront();
        assertEquals(deFront.deFront(str), expected);

    }

    @DataProvider(name = "deFrontDataProvider")
    public String[][] deFrontDataProvider() {

        return new String[][]{

                {"abc", "abc"},
                {"xby", "by"},
                {"ax", "a"},
                {"ba", ""},
                {"hi", ""},
                {"xbc", "bc"},
                {"aaa", "aa"},
                {"his", "s"}
        };
    }
}