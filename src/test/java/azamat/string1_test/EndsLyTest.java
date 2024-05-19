package azamat.string1_test;

import com.digital_nomads.azamat.string1.EndsLy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class EndsLyTest {

    @Test(dataProvider = "endsLyDataProvider")
    public void testEndsLy(String str, boolean expected) {
        EndsLy endsLy = new EndsLy();
        assertEquals(endsLy.endsLy(str), expected);
    }

    @DataProvider
    public Object[][] endsLyDataProvider() {
        return new Object[][]{
                {"lovely", true},
                {"happily", true},
                {"simply", true},
                {"quiet", false},
                {"quickly", true},
                {"slow", false},
                {"wonderfully", true},
                {"", false},
                {"only", true},
                {"ly", true},
                {"l", false}
        };
    }
}

