package jyldyzbek.string1_test;

import com.digital_nomads.almaz.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {

    MakeTags makeTags = new MakeTags();
    @Test(dataProvider = "MakeTags")
    public void makeTagsTest1(String tag, String word, String str1){
        String result = makeTags.makeTags(tag, word);
        Assert.assertEquals(result,str1);
    }

    @DataProvider
    public Object[][] MakeTags() {
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
