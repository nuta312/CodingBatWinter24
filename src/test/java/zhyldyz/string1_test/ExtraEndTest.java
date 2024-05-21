package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.ExtraEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ExtraEndTest {

    @Test(dataProvider = "extraEndDataProvider")
    public void extraEndTest(String str, String expected) {

        var extraEnd = new ExtraEnd();
        assertEquals(extraEnd.extraEnd(str), expected);
    }

    @DataProvider(name = "extraEndDataProvider")
    public String[][] extraEndDataProvider() {

        return new String[][]{

                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Hi", "HiHiHi"},
                {"Candy", "dydydy"},
                {"Code", "dedede"}
        };
    }
}
