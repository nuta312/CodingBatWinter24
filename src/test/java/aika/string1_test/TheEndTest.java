package aika.string1_test;

import com.digital_nomads.aika.string1.NonStart;
import com.digital_nomads.aika.string1.TheEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TheEndTest {
    @Test(dataProvider = "theEndDataProvider")
    public void theEndTest(String a, boolean front, String expected) {

        TheEnd theEnd = new TheEnd();
        assertEquals(theEnd.theEnd (a, front), expected);
    }


    @DataProvider(name = "theEndDataProvider")
    public Object[][] theEndDataProvider() {

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
                {"code", false,"e"}};


    }

}