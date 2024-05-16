package meka.string1_test;

import com.digital_nomads.meka.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEndTest {

    @Test(dataProvider = "testData")
    public void testWithoutEnd(String str, String expected) {
        WithoutEnd withoutEnd = new WithoutEnd();
        String result = withoutEnd.withoutEnd(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"Hello", "ell"},
                {"java", "av"},
                {"coding", "odin"},
                {"code", "od"},
                {"kitten", "itte"},
                {"woohoo", "ooho"}
        };
    }
}
