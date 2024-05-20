package demo.String1_Test;

import com.digital_nomads.shirin.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeTagsTest {

    @Test(dataProvider = "MakeTags")
    public void TestMake(String tag , String word , String except){
        MakeTags make = new MakeTags();
        String str = make.makeTags(tag,word);
        Assert.assertEquals(str,except);
    }

    @DataProvider
    public Object [][] MakeTags(){
        return new Object[][] {
                {"i", "Yay" ,"<i>Yay</i>"},
                {"i", "Hello" ,"<i>Hello</i>"},
                {"cite", "Yay", "<cite>Yay</cite>"},
                {"address", "here","<address>here</address>"},
                {"body", "Heart" ,"<body>Heart</body>"},
                {"i", "i" , "<i>i</i>"}
        };
    }
}
