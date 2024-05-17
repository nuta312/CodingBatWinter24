package almaz.string1_test;

import com.digital_nomads.almaz.string1.ExtraEnd;
import com.digital_nomads.almaz.string1.MakeOutWord;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {
    @Test(dataProvider = "ExtraEndTest")
    public void testExtraEnd(String str, String expected) {
        ExtraEnd extraEnd = new ExtraEnd();
        String result = extraEnd.extraEnd(str);
        assert result.equals(expected);
    }

    @DataProvider
    public Object[][] ExtraEndTest() {
        return new Object[][]{
                {"Hello", "lololo"},
                {"ab", "ababab"},
                {"Hi", "HiHiHi"},
                {"Candy", "dydydy"},
                {"Code", "dedede"},
        };
    }
}
