package janbolot.String_3;

import com.digital_nomads.janbolot.String_3.countYZClass;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class countYZTest {
    @DataProvider(name = "countYZDataProvider")
    public Object[][] countYZDataProvider() {
        return new Object[][]{
                {"fez day", 2},
                {"day fez", 2},
                {"day fyyyz", 2},
                {"day yak", 1},
                {"day:yak", 1},
                {"!!day--yaz!!", 2},
                {"yak zak", 0},
                {"DAY abc XYZ", 2},
                {"aaz yyz my", 3},
                {"y2bz", 2},
                {"zxyx", 0}
        };
    }
    @Test(dataProvider = "countYZDataProvider")
    public void testCountYZ(String input, int expected) {
        int result = countYZClass.countYZ(input);
        Assert.assertEquals(result, expected, "Test failed for input: " + input);
    }
}
