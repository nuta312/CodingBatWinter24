package aika.string1_test;

import com.digital_nomads.aika.string1.WithoutEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WithoutEndTest {
    @Test(dataProvider = "withoutEndDP")
    public void testWithoutEnd(String str, String excepted) {
        WithoutEnd we = new WithoutEnd();
        assertEquals(we.withoutEnd(str), excepted);
    }

    @DataProvider(name = "withoutEndDP")
    public String[][] withoutEndDP() {
        return new String[][]{{"Hello", "ell"},
                {"java", "av"},
                {"coding", "odin"},
                {"code", "od"},
                {"ab", ""},
                {"Chocolate!", "hocolate"},
                {"kitten", "itte"},
                {"woohoo", "ooho"}};
    }

}