package azamat.string1_test;

import com.digital_nomads.azamat.string1.Right2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Right2Test {

    @Test(dataProvider = "right2DataProvider")
    public void testRight2(String str, String expected) {
        Right2 right2 = new Right2();
        assertEquals(right2.right2(str), expected);
    }

    @DataProvider
    public Object[][] right2DataProvider() {
        return new Object[][]{
                {"Hello", "loHel"},
                {"abcdef", "efabcd"},
                {"Hi", "Hi"},
                {"java", "vaja"},
                {"1234", "3412"},
                {"xyz", "yzx"}
        };
    }
}

