package aisuluu.string1_test;

import digital_nomads.aisuluu.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {
    @Test (dataProvider = "tags")
    public void testMakeTags (String tag, String word, String exp){
        MakeTags maketags = new MakeTags();
        Assert.assertEquals(maketags.makeTags(tag,word),exp);
    }
    @DataProvider
    public String[][] tags(){
        return new String[][]{
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
