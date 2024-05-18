package nuraiym.string1_test;

import com.digital_nomads.nuraiym.string1.withoutEnd;
import com.digital_nomads.nuraiym.string1.withoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class withoutEndTest {
    @Test(dataProvider = "withoutEnd")
    public void testWithoutEnd(String str, String expected) {
        withoutEnd withoutEnd = new withoutEnd();
        String result = withoutEnd.withoutEnd(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "withoutEnd")
    public Object[][] withoutEndDataProvider() {
        return new Object[][]{
                {"Hello", "ell"},
                {"java", "av"},
                {"coding", "odin"},
                {"ab", ""},
                {"", ""},
                {"0123456789", "12345678"},
                {"kitten", "itte"},
                {"woohoo", "ooho"}
        };
    }
}
