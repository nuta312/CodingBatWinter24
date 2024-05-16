package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {

    MakeTags makeTags = new MakeTags();

    @DataProvider(name = "tagWordData")
    public Object[][] tagWordData() {
        return new Object[][] {
                {"i", "Yay", "<i>Yay</i>"},
                {"i", "Hello", "<i>Hello</i>"},
                {"cite", "Yay", "<cite>Yay</cite>"}
        };
    }

    @Test(dataProvider = "tagWordData")
    public void testMakeTags(String tag, String word, String expected) {
        String result = makeTags.makeTags(tag, word);
        Assert.assertEquals(result, expected);
    }
}
