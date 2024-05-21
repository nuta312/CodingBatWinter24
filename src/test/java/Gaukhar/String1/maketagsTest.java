package Gaukhar.String1;

import com.digital_nomads.gaukhar.string1.makeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class maketagsTest {
    @Test
            (dataProvider = "makeTagss")
    public void testMakeTags(String tag, String word, String e){
        makeTags mkt = new makeTags();
        String str  = mkt.makeTags(tag, word);
        Assert.assertEquals(str, e);
    }
    @DataProvider
    public Object [][] makeTagss(){
        return new Object[][]{
                {"i", "Yay", "<i>Yay</i>"},
                {"i", "Hello", "<i>Hello</i>"},
                {"cite", "Yay","<cite>Yay</cite>"},
                {"address", "here","<address>here</address>"},
                {"body", "Heart","<body>Heart</body>"},
                {"i", "i","<i>i</i>"},
                {"i", "","<i></i>"}
        };
    }
}
