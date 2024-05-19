package shirin.String1;

import com.digital_nomads.shirin.string1.ExtraFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraFront_Test {

    @Test(dataProvider = "ExtraFront")
    public void TestExtraFront(String str , String except){
        ExtraFront extra = new ExtraFront();
        String a = extra.extraFront(str);
        Assert.assertEquals(a,except);
    }

    @DataProvider
    public Object[][] ExtraFront(){
        return new Object[][]{
                {"Hello" ,"HeHeHe"},
                {"ab" , "ababab"},
                {"H" ,"HHH"},
                {"" ,""},
                {"Candy" , "CaCaCa"},
                {"Code" ,"CoCoCo"}
        };
    }


}
