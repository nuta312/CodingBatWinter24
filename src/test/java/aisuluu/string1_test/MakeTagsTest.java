package aisuluu.string1_test;

import com.digital_nomads.aisuluu.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {
    @Test (dataProvider = "maketags")
    public void testMakeTags (String tag, String word, String exp){
        MakeTags maketags = new MakeTags();
        String result = maketags.makeTags(tag, word);
        Assert.assertEquals(maketags.makeTags(tag, word), exp);
    }
    @DataProvider
    public String [][] maketags(){
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
