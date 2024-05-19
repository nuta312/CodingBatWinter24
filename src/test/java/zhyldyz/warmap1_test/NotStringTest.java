package zhyldyz.warmap1_test;

import com.digital_nomads.zhyldyz.warmap1.NotString;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NotStringTest {

    NotString notString = new NotString();

    @DataProvider(name = "notStringTest")
    public String[][] notStringDataProvider() {

        return new String[][]{

                {"candy", "not candy"},
                {"x", "not x"},
                {"not bad", "not bad"},
                {"bad", "not bad"},
                {"not", "not"},
                {"is not", "not is not"},
                {"no", "not no"}
        };
    }

    @Test(dataProvider = "notStringTest")
    void notStringTest(String str, String expected) {

        assertEquals(notString.notString(str), expected);
    }
}