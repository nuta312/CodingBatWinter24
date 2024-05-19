package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.TwoChar;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TwoCharTest {

    TwoChar twoChar = new TwoChar();

    @Test(dataProvider = "twoCharDataProvider")
    void twoCharTest(String str, Integer index, String excepted) {

        assertEquals(twoChar.twoChar(str, index), excepted);
    }

    @DataProvider(name = "twoCharDataProvider")
    public Object[][] twoCharDataProvider() {
        return new Object[][]{

                {"java", 0, "ja"},
                {"java", 4, "ja"},
                {"java", -1, "ja"},
                {"java", 2, "va"},
                {"Hello", 0, "He"},
                {"Hello", 1, "el"},
                {"Hello", 99, "He"}
        };
    }
}