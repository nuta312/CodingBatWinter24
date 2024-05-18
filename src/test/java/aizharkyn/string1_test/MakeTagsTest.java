package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {

    @Test(dataProvider = "tagsProvider")
    public void testTags(String tag, String word, String expected){
        Assert.assertEquals(MakeTags.makeTags(tag, word), expected);
    }

    @DataProvider
    public Object [][] tagsProvider(){
        return new Object[][]{
                {"i", "Yay", "<i>Yay</i>"},
                {"i", "Hello","<i>Hello</i>" },
                {"cite", "Yay", "<cite>Yay</cite>"},
                {"address", "here","<address>here</address>"}
        };
    }
}
