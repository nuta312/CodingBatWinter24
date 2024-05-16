package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.LastChars;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LastCharsTest {

    LastChars lastChars = new LastChars();

    @Test(dataProvider = "LastCharDataProvider")
    public void lastCHarTest(String a, String b, String expected) {

        assertEquals(lastChars.lastChars(a, b), expected);

    }

    @DataProvider(name = "LastCharDataProvider")
    public String[][] lastCharDataProvider() {

        return new String[][]{

                {"last", "chars", "ls"},
                {"yo", "java", "ya"},
                {"hi", "", "h@"},
                {"", "hello", "@o"},
                {"", "", "@@"},
                {"k", "zip", "kp"},
                {"kitten", "", "k@"}
        };
    }

}
