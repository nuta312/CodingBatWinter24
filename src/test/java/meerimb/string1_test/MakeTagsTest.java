package meerimb.string1_test;

import com.digital_nomads.meerimb.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {
    MakeTags makeTags = new MakeTags();

    @Test(dataProvider = "makeTag")
    public void testMakeTags(String tag, String word, String expected) {

        String startTag = "<" + tag + ">";
        String endTag = "</" + tag + ">";

        String actualResult = startTag + word + endTag;

        Assert.assertEquals(actualResult, expected);
    }

    @DataProvider(name = "makeTag")
    public String[][] makeTag() {
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
