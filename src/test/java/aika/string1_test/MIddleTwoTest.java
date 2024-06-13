package aika.string1_test;

import com.digital_nomads.aika.string1.MIddleTwo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MIddleTwoTest {
    @Test(dataProvider = "middleTwo")
    public void testMiddleTwo(String str, String except) {
        MIddleTwo mt = new MIddleTwo();
        assertEquals(mt.middleTwo(str), except);
    }

    @DataProvider(name = "middleTwo")
    public String[][] middleTwo() {
        return new String[][]{{"string", "ri"},
                {"code", "od"},
                {"Practice", "ct"},
                {"ab", "ab"},
                {"0123456789", "45"}};
    }
}