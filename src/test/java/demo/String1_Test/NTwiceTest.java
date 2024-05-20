package demo.String1_Test;

import com.digital_nomads.shirin.string1.NTwice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NTwiceTest {

    @Test(dataProvider = "NTwice")
    public void TestNTwiceT(String str , int n, String except){
        NTwice nt = new NTwice();
        String d =nt.nTwice(str,n);
        Assert.assertEquals(d , except);
    }

    @DataProvider
    public Object[][] NTwice(){
        return new Object[][]{
                {"Hello" ,2,  "Helo"},
                {"Chocolate",3, "Choate"},
                {"Chocolate",1,  "Ce"},
                {"Chocolate", 0 , ""}
        };
    }
}
