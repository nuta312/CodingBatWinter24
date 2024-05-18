package dzhamilya.string1_test;

import com.digital_nomads.dzhamilya.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {

    @Test
            (dataProvider = "makeTest")
    public void tagsTest(String tag, String word, String expected) {
        MakeTags tags = new MakeTags();
        String result = tags.makeTags(tag, word);
        Assert.assertEquals(result, expected);


    }
@DataProvider
    public Object[][] makeTest() {
        return new Object[][] {
                {"i", "Yay" , "<i>Yay</i>"},
                {"i", "Hello", "<i>Hello</i>"},
                {"cite", "Yay", "<cite>Yay</cite>"},
                {"address", "here", "<address>here</address>"},
                {"body", "Heart", "<body>Heart</body>"},
                {"i", "i",  "<i>i</i>"},
                {"i", "", "<i></i>"},

        };
    }
}
