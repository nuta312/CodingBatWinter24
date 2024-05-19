package azamat.string1_test;
import com.digital_nomads.azamat.string1.TheEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TheEndTest {

    @Test(dataProvider = "theEndDataProvider")
    public void testTheEnd(String str, boolean front, String expected) {
        TheEnd theEnd = new TheEnd();
        assertEquals(theEnd.theEnd(str, front), expected);
    }

    @DataProvider
    public Object[][] theEndDataProvider() {
        return new Object[][]{
                {"Hello", true, "H"},
                {"Hello", false, "o"},
                {"abcdef", true, "a"},
                {"abcdef", false, "f"},
                {"Hi", true, "H"},
                {"Hi", false, "i"},
                {"1234", true, "1"},
                {"1234", false, "4"},
                {"xyz", true, "x"},
                {"xyz", false, "z"}
        };
    }

}
