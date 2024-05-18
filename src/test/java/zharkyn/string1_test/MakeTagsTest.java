package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {

    @Test (dataProvider = "makeTagsDataProvider")
    public void makeTagsTest(String tag, String word, String expected){
        MakeTags makeTags = new MakeTags();
        Assert.assertEquals(makeTags.makeTags(tag,word), expected);
    }

    @DataProvider(name = "makeTagsDataProvider")
    public Object[][] makeTagsDataProvider(){
        return new Object[][]{
                {"i", "Yay", "<i>Yay</i>"},
                {"i", "Hello", "<i>Hello</i>"},
                {"cite", "Yay", "<cite>Yay</cite>"},
                {"address", "here",  "<address>here</address>"},
                {"body", "Heart", "<body>Heart</body>"},
                {"i", "i", "<i>i</i>"},
                {"i", "", "<i></i>"}
        };
    }
}
