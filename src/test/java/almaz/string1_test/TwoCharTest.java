package almaz.string1_test;

import com.digital_nomads.almaz.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoCharTest {
    @Test(dataProvider = "TwoCharTest")
    public void testTwoChar(String str, int index, String expect) {
        TwoChar twoChar = new TwoChar();
        String result = twoChar.twoChar(str, index);
        Assert.assertEquals(result, expect);
    }

    @DataProvider
    public Object[][] TwoCharTest() {
        return new Object[][]{
                {"java", 0, "ja"},
                {"java", 2, "va"},
                {"java", -1, 	"ja"},
                {"Hello", 99, "He"},
                {"Hello", 4, "He"},
                {"Hello", -1, "He"},
                {"yay", 0, "ya"}
                ,};
    }
}
