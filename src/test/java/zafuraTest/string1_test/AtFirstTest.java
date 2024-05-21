package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.AtFirst;
import com.digital_nomads.zafura.string1.HasBed;
import com.digital_nomads.zafura.string1.LastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtFirstTest {
    @Test(dataProvider = "first")
    public void testLastChars(String a,String b,  String expected) {
        LastChars lastChars = new LastChars();
        Assert.assertEquals(lastChars.lastChars(a,b), expected);
    }

    @DataProvider
    public Object[][] first() {

        return new Object[][]{
                {"last", "chars", "ls"},
                {"yo", "java", "ya"},
                {"kitten", "", "k@"},
        };
    }
}


