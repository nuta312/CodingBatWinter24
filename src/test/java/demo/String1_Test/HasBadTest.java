package demo.String1_Test;

import com.digital_nomads.shirin.string1.HasBad;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasBadTest {

    @Test(dataProvider ="Bad" )
    public  void  TestHasBat(String str , boolean expect){
        HasBad Has = new HasBad();
        boolean  a = Has.hasBad(str);
        Assert.assertEquals(a,expect);
    }

@DataProvider
    public Object[][] Bad(){
        return new Object[][]{
                {"badxx" , true},
                {"xbadxx" , true},
                {"xxbadxx" , false},
                {"code" , false}
        };
    }
}
