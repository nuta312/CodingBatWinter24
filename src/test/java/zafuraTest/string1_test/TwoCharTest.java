package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.EndSly;
import com.digital_nomads.zafura.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoCharTest {
    @Test(dataProvider = "chars")
    public void testTwoChar(String str, int index, String expected) {
        TwoChar twoChar = new TwoChar();
        Assert.assertEquals(twoChar.twoChar(str, index), expected);
    }

    @DataProvider
    public Object[][] chars() {

        return new Object[][]{
                {"java", 0, "ja"},
                {"java", 2, "va"},
                {"yay", 0, "ya"},
        };
    }
    }
