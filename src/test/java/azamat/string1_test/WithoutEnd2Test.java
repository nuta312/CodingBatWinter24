package azamat.string1_test;

import com.digital_nomads.azamat.string1.WithoutEnd2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class WithoutEnd2Test {

    @Test(dataProvider = "withoutEnd2DataProvider")
    public void testWithoutEnd2(String str, String expected) {
        WithoutEnd2 withoutEnd2 = new WithoutEnd2();
        assertEquals(withoutEnd2.withoutEnd2(str), expected);
    }

    @DataProvider
    public Object[][] withoutEnd2DataProvider() {
        return new Object[][]{
                {"Hello", "ell"},
                {"abcdef", "bcde"},
                {"Hi", ""},
                {"a", ""},
                {"1234", ""},
                {"xyz", ""}
        };
    }
}

