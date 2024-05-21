package aynura.string1_test;

import com.digital_nomads.meka.string1.AtFirst;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtFirstTest {

    @Test
    public void testAtFirst(String str, String expectedResult){
        AtFirst obj = new AtFirst();
        String actualResult = obj.atFirst(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "word")
    public Object[][] providerWord() {
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
