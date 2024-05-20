package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.TheEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TheEndTest {

    TheEnd theEnd = new TheEnd();

    @Test(dataProvider = "theEndDataProvider")
    void theEndTest(String str, boolean front, String exception) {

        assertEquals(theEnd.theEnd(str, front), exception);

    }

    @DataProvider(name = "theEndDataProvider")
    public Object[][] theEndDataProvider() {

        return new Object[][]{

                {"Hello", false, "o"},
                {"Hello", true, "H"},
                {"oh", true, "o"},
                {"oh", false, "h"},
                {"java", true, "j"},
                {"chocolate", false, "e"},
                {"1234", true, "1"}
        };
    }
}