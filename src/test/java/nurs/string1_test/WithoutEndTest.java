package nurs.string1_test;

import com.digital_nomads.nurs.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEndTest {
    @DataProvider(name = "words")
    public Object [][] provideWord(){
        return new Object[][]{
                {"Hello", "ell"},
                {"java", "av"},
                {"coding", "odin"},
                {"code", "od"},
                {"ab", ""},
                {"Chocolate!", "hocolate"	},
                {"kitten", "itte"},
                {"woohoo", "ooho"},
        };
    }

    @Test(dataProvider = "words")
    public void testWithoutEnd(String str, String expectedResult) {
        WithoutEnd obj = new WithoutEnd();
        String actualResult = obj.withoutEnd(str);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
