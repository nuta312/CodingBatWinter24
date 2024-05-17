package aijan.string1_test;

import com.digital_nomads.aijan.string1.AtFirst;
import com.digital_nomads.aijan.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AtFirstTest {

    @DataProvider(name = "word")
    public Object[][] provideWord() {
        return new Object[][]{
                {"hello","he"},
                {"hi","hi"},
                {"h","h@"},
                {"","@@"},
                {"kitten","ki"},
                {"java","ja"},
                {"j","j@"},

        };

    }

    @Test(dataProvider = "word")
    public void testAtFirst(String str, String expectedResult) {
        AtFirst obj = new AtFirst();
        String actualResult = obj.atFirst(str);
        Assert.assertEquals(actualResult,expectedResult);
    }



}