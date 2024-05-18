package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.ConCat;
import com.digital_nomads.aizharkyn.string1.LastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCatTest {

    @Test(dataProvider = "conCatProvider")
    public void testConcat(String a, String b,  String expected){
        Assert.assertEquals(ConCat.conCat(a,b), expected);
    }

    @DataProvider
    public Object[][] conCatProvider(){
        return new Object[][]{
                {"abc", "cat","abcat"},
                {"dog", "cat","dogcat"},
                {"abc", "", "abc"},
                {"pig", "doggy","pigdoggy"},
        };
    }
}
