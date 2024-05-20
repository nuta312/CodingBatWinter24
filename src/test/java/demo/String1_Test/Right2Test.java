package demo.String1_Test;

import com.digital_nomads.shirin.string1.Right2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Right2Test {

    @Test(dataProvider = "Right")
    public void testRight(String str , String except ){
        Right2 rich = new Right2();
        String a = rich.right2(str);
        Assert.assertEquals(a,except);
    }

    @DataProvider
    public Object[][] Right (){
        return new Object[][] {
                {"Hello","loHel"},
                {"java" ,"vaja"},
                {"Hi" , "Hi"},
                {"code", "deco"},
                {"cat","atc"}
        };
    }
}
