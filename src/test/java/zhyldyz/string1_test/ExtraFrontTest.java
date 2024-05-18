package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.ExtraFront;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExtraFrontTest {

    ExtraFront extraFront = new ExtraFront();

    @Test(dataProvider = "extraFrontDataProvider")
    void extraFrontTest(String str, String exception) {

        assertEquals(extraFront.extraFront(str), exception);
    }

    @DataProvider(name = "extraFrontDataProvider")
    public String[][] extraFrontDataProvider() {

        return new String[][]{

                {"ab", "ababab"},
                {"H", "HHH"},
                {"", ""},
                {"Candy", "CaCaCa"},
                {"Code", "CoCoCo"},
                {"Hello", "HeHeHe"}

        };
    }
}