package azamat.string1_test;
import com.digital_nomads.azamat.string1.FirstHalf;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FirstHalfTest {

    @Test(dataProvider = "firstHalfDataProvider")
    public void testFirstHalf(String str, String expected) {
        FirstHalf firstHalf = new FirstHalf();
        assertEquals(firstHalf.firstHalf(str), expected);
    }

    @DataProvider
    public Object[][] firstHalfDataProvider() {
        return new Object[][]{
                {"HelloWorld", "Hello"},
                {"abcdef", "abc"},
                {"Hi", "H"},
                {"", ""},
                {"x", ""},
                {"1234", "12"},
                {"wxyz", "wx"}
        };
    }
}