package aika.string1_test;

import com.digital_nomads.aika.string1.MiddleThree;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MiddleThreeTest {
    @Test(dataProvider = "middleThreeDP")
    public void testMiddleThree(String str, String except) {
        MiddleThree mt = new MiddleThree();
        assertEquals(mt.middleThree(str), except);
    }

    @DataProvider(name = "middleThreeDP")
    public String[][] middleThreeDP() {
        return new String[][]{{"Candy", "and"},
                {"and", "and"},
                {"solving", "lvi"},
                {"Hi yet Hi", "yet"},
                {"java yet java", "yet"},
                {"Chocolate", "col"},
                {"XabcxyzabcX", "xyz"}};
    }
}