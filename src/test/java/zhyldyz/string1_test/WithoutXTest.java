package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.WithoutX;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WithoutXTest {

    @Test(dataProvider = "withoutXDataProvider")
    public void withoutXTest(String str, String expected) {

        WithoutX withoutX = new WithoutX();
        assertEquals(withoutX.withoutX(str), expected);

    }

    @DataProvider(name = "withoutXDataProvider")
    public String[][] withoutXDataProvider() {
        return new String[][]{

                {"xHix", "Hi"},
                {"xHi", "Hi"},
                {"xxHi", "xHi"},
                {"Hix", "Hi"},
                {"xx", ""},
                {"x", ""},
                {"", ""}
        };
    }
}