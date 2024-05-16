package alihan.string1_test;

import com.digital_nomads.alihan.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {

    @Test(dataProvider = "makeTags")
    public void testMakeTags (String tag, String word, String expected){
        MakeTags makeTags = new MakeTags();
        String result = makeTags.makeTags(tag,word);
        Assert.assertEquals(result,expected);

    }
    @DataProvider
    public Object[][] makeTags(){
        return new Object[][]{

                {
                "i", "Yay", "<i>Yay</i>"
        }, {
                "i", "Hello", "<i>Hello</i>"
        },{
                "cite", "Yay" ,"<cite>Yay</cite>"
        },{
                "address", "here" ,  "<address>here</address>"
        },{
                "body", "Heart" , "<body>Heart</body>"
        },{
                "i", "i" , "<i>i</i>"
        }, {
                "i", "" , "<i></i>"
        }
        };

    }

}
