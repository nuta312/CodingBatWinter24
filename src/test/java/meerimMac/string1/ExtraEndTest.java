package meerimMac.string1;

import com.digital_nomads.MeerimMac.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {

@DataProvider(name = "word")
public Object [][] getWords(){
    return new Object[][]{
            {"Bob", "obobob"},
            {"Alice", "cecece"}
    };
}




    @Test(dataProvider = "word")
    public void extraEnd(String str, String exp){
        ExtraEnd extraEnd= new ExtraEnd();
       String actual = extraEnd.extraEnd(str);
        Assert.assertEquals(exp, actual);
    }
}
