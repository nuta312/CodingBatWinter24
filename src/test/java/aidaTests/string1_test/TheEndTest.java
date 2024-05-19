package aidaTests.string1_test;

import com.digital_nomads.aika.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheEndTest {

    @Test(dataProvider = "provider")
    public void testTheEnd(String str, boolean front, String expectedResult){
        TheEnd theEnd = new TheEnd();
        Assert.assertEquals(theEnd.theEnd(str, front), expectedResult);
    }

    @DataProvider
    public Object [][] provider(){
        return new Object[][]{
                {"Hello", true, "H"},
                {"Hello", false, "o"},
                {"oh", true, "o"},
                {"oh", false, "h"},
                {"x", true, "x"},
                {"x", false, "x"},
                {"java", true, "j"},
                {"chocolate", false, "e"},
                {"1234", true, "1"},
                {"code", false, "e"}
        };
    }
}
