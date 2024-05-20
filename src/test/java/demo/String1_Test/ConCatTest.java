package demo.String1_Test;

import com.digital_nomads.shirin.string1.ConCat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConCatTest {
    @Test(dataProvider ="ConCat")
    public void TestCat(String a , String b , String expect){
        ConCat cat = new ConCat();
        String str = cat.conCat(a , b );
        Assert.assertEquals(str,expect);
    }

@DataProvider
    public Object[][] ConCat(){
        return new Object[][] {
                {"abc", "cat" , "abcat"},
                {"dog", "cat" , "dogcat"},
                {"abc", "" ,"abc" },
                {"", "cat" ,"cat"},
                {"pig", "g", "pig" },
                {"pig", "doggy" ,"pigdoggy"}
        };
    }
}
