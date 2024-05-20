package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.EndsLy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EndsLyTest {

    @Test(dataProvider = "endsLyDataProvider")
    public void endsLyTest(String str, boolean expected) {

        EndsLy endsLy = new EndsLy();
        assertEquals(endsLy.endsLy(str), expected);
    }

    @DataProvider(name = "endsLyDataProvider")
    public Object[][] endsLyDataProvider() {

        return new Object[][]{

                {"oddly", true},
                {"y", false},
                {"oddl", false},
                {"ly", true},
                {"", false}
        };

    }

}
