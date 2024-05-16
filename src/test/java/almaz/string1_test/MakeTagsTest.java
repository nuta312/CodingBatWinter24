package almaz.string1_test;

import com.digital_nomads.almaz.string1.MakeTags;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {

    @Test(dataProvider = "MakeTagsTest")
    public void testMakeTags(String tag, String word){
        MakeTags makeTags = new MakeTags();
    }

    @DataProvider
    public Object [][] MakeTagsTest() {
        return new Object[][]{
                {"i", "Yay"},
                {"i", "Hello"},
                {"cite", "Yay"},
                {"address", "here"},
                {"i", "i"},
                {"i", ""}
        };
    }
}
