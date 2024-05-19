package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.WithoutEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WithoutEndTest {

    @Test(dataProvider = "withoutEndDataProvider")
    public void withoutEndTest(String str, String expected) {

        var withoutEnd = new WithoutEnd();
        assertEquals(withoutEnd.withoutEnd(str), expected);
    }

    @DataProvider(name = "withoutEndDataProvider")
    public String[][] withoutEndDataProvider() {

        return new String[][]{

                {"Hello", "ell"},
                {"java", "av"},
                {"coding", "odin"},
                {"code", "od"},
                {"ab", ""},
                {"Chocolate!", "hocolate"},
                {"kitten", "itte"}
        };
    }

}