package aika.string1_test;

import com.digital_nomads.aika.string1.WithoutEnd2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WithoutEnd2Test {
    @Test(dataProvider = "withoutEnd2")
    public void testWithoutEnd2(String str, String except) {
        WithoutEnd2 we2 = new WithoutEnd2();
        assertEquals(we2.withouEnd2(str), except);
    }

    @DataProvider(name = "withoutEnd2")
    public String[][] withoutEnd2() {
        return new String[][]{{"Hello", "ell"},
                {"abc", "b"},
                {"ab", ""},
                {"a", ""},
                {"", ""},
                {"coldy", "old"},
                {"java code", "ava cod"}};
    }
}