package aika.string1_test;

import com.digital_nomads.aika.string1.AtFirst;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AtFirstTest {
    @Test(dataProvider = "atFirstDP")
    public void testAtFirst(String str, String except) {
        AtFirst af = new AtFirst();
        assertEquals(af.atFirst(str), except);
    }

    @DataProvider(name = "atFirstDP")
    public String[][] atFirstDP() {
        return new String[][]{{"hello", "he"},
                {"hi", "hi"},
                {"h", "h@"},
                {"", "@@"},
                {"kitten", "ki"},
                {"java", "ja"},
                {"j", "j@"}};
    }
}