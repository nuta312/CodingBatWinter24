package janar.string_1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstTwoTest {
    public class ExtraEndTest {

        @DataProvider(name = "testData")
        public Object[][] testData() {
            return new Object[][]{
                    {"Hello", "lololo"},
                    {"ab", "ababab"},
                    {"Hi", "HiHiHi"},
            };
        }

        @Test(dataProvider = "testData")
        public void testExtraEnd(String input, String expected) {
            String result = extraEnd(input);
            assertEquals(result, expected);
        }

        public String extraEnd(String str) {
            if (str.length() < 2) {
                throw new IllegalArgumentException("String length must be at least 2.");
            }
            String lastTwoChars = str.substring(str.length() - 2);
            return lastTwoChars + lastTwoChars + lastTwoChars;
        }
    }

}
