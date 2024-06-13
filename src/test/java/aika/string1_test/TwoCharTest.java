package aika.string1_test;

import com.digital_nomads.aika.string1.TwoChar;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TwoCharTest {
    @Test(dataProvider = "twoChar")
    public void testTwoChar(String str, int index, String except) {
        TwoChar tc = new TwoChar();
        assertEquals(tc.twoChar(str, index), except);
    }

    @DataProvider(name = "twoChar")
    public Object[][] twoChar() {
        return new Object[][]{{"java", 0, "ja"},
                {"java", 2, "va"},
                {"java", 3, "ja"},
                {"java", 4, "ja"},
                {"java", -1, "ja"},
                {"Hello", 0, "He"},
                {"Hello", 1, "el"},
                {"Hello", 99, "He"},
                {"Hello", 3, "lo"},
                {"Hello", 4, "He"},
                {"Hello", 5, "He"},
                {"Hello", -7, "He"},
                {"Hello", 6, "He"},
                {"Hello", -1, "He"},
                {"yay", 0, "ya"}};
    }
}
