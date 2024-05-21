package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.MakeTags;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MakeTagsTest {


    @Test(dataProvider = "makeTagsDataProvider")
    public void makeTagsTest(String tag, String word, String expected) {

        var makeTags = new MakeTags();
        assertEquals(makeTags.makeTags(tag, word), expected);

    }

    @DataProvider(name = "makeTagsDataProvider")
    public String[][] makeTagsDataProvider() {
        return new String[][]{

                {"i", "Yay", "<i>Yay</i>"},
                {"i", "Hello", "<i>Hello</i>"},
                {"cite", "Yay", "<cite>Yay</cite>"},
                {"address", "here", "<address>here</address>"},
                {"body", "Heart", "<body>Heart</body>"},
                {"i", "i", "<i>i</i>"},
                {"i", "", "<i></i>"},

        };

    }

}