package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.AtFirst;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtFirstTest {

    @Test(dataProvider = "atFirstDataProvider")
    public void atFirstTest(String str, String expected){
        AtFirst atFirst = new AtFirst();
        Assert.assertEquals(atFirst.atFirst(str), expected);
    }

    @DataProvider(name = "atFirstDataProvider")
    public Object[][] atFirstDataProvider() {
        return new Object[][]{
                {"hello", "he"},
                {"hi", "hi"},
                {"h", "h@"},
                {"", "@@"},
                {"kitten", "ki"},
                {"java", "ja"},
                {"j", "j@"}
        };
    }
}
