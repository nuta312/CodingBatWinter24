package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.AtFirst;
import com.digital_nomads.zafura.string1.HasBed;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtFirstTest {
    @Test(dataProvider = "first")
    public void testAtFirst(String str,  String expected) {
        AtFirst atFirst= new AtFirst();
        Assert.assertEquals(atFirst.atFirst(str), expected);
    }

    @DataProvider
    public Object[][] first() {

        return new Object[][]{
                {"hello", "he"},
                {"hi","hi"},
                {"j","j@"},
        };
    }
}


