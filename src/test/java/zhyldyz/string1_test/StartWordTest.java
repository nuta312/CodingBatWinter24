package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.StartWord;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StartWordTest {

    StartWord startWord = new StartWord();

    @Test(dataProvider = "startWordDataProvider")
    void startWordTest(String str, String word, String exception) {

        assertEquals(startWord.startWord(str, word), exception);
    }

    @DataProvider(name = "startWordDataProvider")
    public String[][] startWordDataProvider() {

        return new String[][]{

                {"hippo", "i", "h"},
                {"hippo", "ix", ""},
                {"h", "ix", ""},
                {"", "i", ""},
                {"hip", "zi", "hi"},
                {"hip", "zip", "hip"},
                {"hip", "zig", ""},
                {"h", "z", "h"},
                {"hippo", "xippo", "hippo"},
                {"hippo", "xip", "hip"}
        };
    }
}