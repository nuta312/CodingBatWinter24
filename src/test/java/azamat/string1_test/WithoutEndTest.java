package azamat.string1_test;

import com.digital_nomads.azamat.string1.WithoutEnd2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class WithoutEndTest {

    @Test(dataProvider = "withoutEndDataProvider")
    public void testWithoutEnd(String input, String expected) {
        WithoutEnd2 withoutEnd = new WithoutEnd2();
        assertEquals(withoutEnd.withoutEnd2(input), expected);
    }

    @DataProvider
    public Object[][] withoutEndDataProvider() {
        return new Object[][]{
                {"Hello", "ell"},
                {"abcdef", "bcde"},
                {"Hi", ""},
                {"1234", "23"},
                {"xyz", "y"}
        };
    }
}