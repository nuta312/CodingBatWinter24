package demo.String1_Test;

import com.digital_nomads.shirin.string1.LastTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastTwoTest {

    @Test(dataProvider = "LastTwo")
    public void  TestLastTwo (String str , String except){
        LastTwo last = new LastTwo();
        String a = last.lastTwo(str);
        Assert.assertEquals(a,except);
    }

    @DataProvider
    public Object[][] LastTwo (){
        return new Object[][] {
                {"coding" , "codign"},
                {"cat" , "cta"},
                {"ab" ,"ba"},
                {"a" ,"a"},
                {"" , ""}
        };
    }
}
