package demo.String1_Test;

import com.digital_nomads.shirin.string1.AtFirst;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class AtFirstTest {
    @Test(dataProvider = "AtFirst")
    public void TestAtFirstTest(String str, String expect ){
        AtFirst first = new AtFirst();
        String result = first.atFirst(str);
        Assert.assertEquals(result , expect);
    }
@DataProvider
    public Object [][] AtFirst(){
        return new Object[][] {
                {"hello" ,"he"},
                {"hi" , "hi"},
                {"h" , "h@"},
                {"" , "@@"},
                {"kitten", "ki"},
                {"java" , "ja"},
                {"j" , "j@"},

        };
    }
}
