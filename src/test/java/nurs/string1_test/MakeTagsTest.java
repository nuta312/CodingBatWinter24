package nurs.string1_test;

import com.digital_nomads.nurs.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {
    @DataProvider(name = "words")
    public Object[][] provideWords() {
        return new Object[][]{
                {"i", "Yay", "<i>Yay</i>"},
                {"i", "Hello", "<i>Hello</i>"},
                {"cite", "Yay", "<cite>Yay</cite>"},
                {"address", "here", "<address>here</address>"},
                {"body", "Heart", "<body>Heart</body>"},
                {"i", "i", "<i>i</i>"},
                {"i", "", "<i></i>"}
        };
    }
    @Test(dataProvider = "words")
    public void TestMakeTags(String tag, String word, String expected) {
        MakeTags obj = new MakeTags();
        Assert.assertEquals(obj.makeTags(tag, word),expected);
    }
}
