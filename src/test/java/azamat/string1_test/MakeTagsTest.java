package azamat.string1_test;

import com.digital_nomads.azamat.string1.MakeTags;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MakeTagsTest {  @Test(dataProvider = "makeTagsDataProvider")
public void testMakeTags(String tag, String word, String expected) {
    MakeTags makeTags = new MakeTags();
    assertEquals(makeTags.makeTags(tag, word), expected);
}

    @DataProvider
    public Object[][] makeTagsDataProvider() {
        return new Object[][]{
                {"i", "Yay", "<i>Yay</i>"},
                {"strong", "Hello", "<strong>Hello</strong>"},
                {"em", "Wow", "<em>Wow</em>"},
                {"code", "Java", "<code>Java</code>"},
                {"b", "Bold", "<b>Bold</b>"},
                {"u", "Underline", "<u>Underline</u>"},
                {"h1", "Heading", "<h1>Heading</h1>"},
                {"p", "Paragraph", "<p>Paragraph</p>"}
        };
    }
}
