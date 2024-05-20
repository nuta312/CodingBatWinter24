package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.MinCat;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MinCatTest {

    MinCat minCat = new MinCat();

    @Test(dataProvider = "minCatDataProvider")
    void minCatTest(String a, String b, String exception) {

        assertEquals(minCat.minCat(a, b), exception);
    }

    @DataProvider(name = "minCatDataProvider")
    public String[][] minCatDataProvider() {

        return new String[][]{

                {"Hello", "java", "ellojava"},
                {"java", "Hello", "javaello"},
                {"abc", "x", "cx"},
                {"x", "abc", "xc"},
                {"abc", "", ""},
                {"Hello", "Hi", "loHi"}
        };
    }

}