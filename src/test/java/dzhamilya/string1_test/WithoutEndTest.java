package dzhamilya.string1_test;

import com.digital_nomads.dzhamilya.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEndTest {
    @Test (dataProvider = "without1Test")
    public void testWithout (String str, String expected){
        WithoutEnd without = new WithoutEnd();
        String result = without.withoutEnd(str);
        Assert.assertEquals(result, expected);

    }
    @DataProvider
    public Object [][]without1Test(){
            return new Object[][] {
                    {"Hello", "ell"},
                    {"java", "av"},
                    {"coding", "odin"},
                    {"code", "od"},
                    {"ab", ""},
                    {"Chocolate!", "hocolate"},
                    {"kitten", "itte"},
                    {"woohoo", "ooho"},
            };
    }
}
