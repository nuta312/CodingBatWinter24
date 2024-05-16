package almaz.string1_test;

import com.digital_nomads.almaz.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {

    @Test(dataProvider = "MakeTagsTest")
    public void testMakeTags(String tag, String word, String expect) {
        MakeTags makeTags = new MakeTags();
        String result = makeTags.makeTags(tag, word);
        Assert.assertEquals(result,expect);
    }

    @DataProvider
    public Object[][] MakeTagsTest() {
        return new Object[][]{
                {"i", "Yay","<i>Yay</i>"},
                {"i", "Hello","<i>Hello</i>"},
                {"cite", "Yay",	"<cite>Yay</cite>"},
                {"address", "here","<address>here</address>"},
                {"i", "i","<i>i</i>"},
                {"i", "","<i></i>"}
        };
    }
}
