package nuraiym.string1_test;

import com.digital_nomads.nuraiym.string1.middleThree;
import com.digital_nomads.nuraiym.string1.middleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class middleThreeTest {
    @Test(dataProvider = "middleThreeDataProvider")
    public void testMiddleThree(String str, String expected) {
        middleThree middleThree = new middleThree();
        String result = middleThree.middleThree(str);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "middleThreeDataProvider")
    public Object[][] middleThreeDataProvider() {
        return new Object[][]{
                {"Candy", "and"},
                {"and", "and"},
                {"solving", "lvi"},
                {"Hi yet Hi", "yet"},
                {"java yet java", "yet"},
                {"Chocolate", "col"},
                {"XabcxyzabcX", "xyz"}
        };
    }
}

