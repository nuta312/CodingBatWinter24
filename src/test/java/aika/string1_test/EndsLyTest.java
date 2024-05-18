package aika.string1_test;

import com.digital_nomads.aika.string1.EndsLy;
import com.digital_nomads.aika.string1.TheEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EndsLyTest {
    @Test(dataProvider = "EndsLyDataProvider")
    public void EndsLyTest(String str, boolean expected) {

        EndsLy endsLy = new EndsLy();
        boolean result = endsLy.endsLy(str);
        assertEquals(result, expected);
    }

    @DataProvider
    public Object[][] EndsLyDataProvider() {
        return new Object[][]{
                {"oddly", true},
                {"y", false},
                {"oddy", false},
                {"oddl", false},
                {"olydd", false},
                {"ly", true},
                {"", false},
                {"falsey", false},
                {"evenly", true}};


    }

}