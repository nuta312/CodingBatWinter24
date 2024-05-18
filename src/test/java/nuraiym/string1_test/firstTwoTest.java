package nuraiym.string1_test;

import com.digital_nomads.almaz.string1.FirstTwo;
import com.digital_nomads.nuraiym.string1.ExtraEnd;
import com.digital_nomads.nuraiym.string1.firstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class firstTwoTest {

    @Test(dataProvider = "firstTwo")
    public void testFirstTwo(String str, String expected) {
        firstTwo firstTwo = new firstTwo();
        String result = firstTwo.firstTwo(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "firstTwo")
    public Object[][] firstTwoDataProvider() {
        return new Object[][]{
                {"Hello", "He"},
                {"abcdefg", "ab"},
                {"ab", "ab"},
                {"a", "a"},
                {"", ""},
                {"Kitten", "Ki"},
                {"hi", "hi"},
                {"hiya", "hi"}
        };
    }
}
