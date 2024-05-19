package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.NTwice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NTwiceTest {

    @Test(dataProvider = "nTwiceDataProvider")
    public void  nTwiceTest(String a, int n, String str){
        NTwice nTwice = new NTwice();
        Assert.assertEquals(nTwice.nTwice(a,n), str);
    }

    @DataProvider(name = "nTwiceDataProvider")
    public Object[][]  nTwiceDataProvider(){
        return new Object[][] {
                {"Hello", 2, "Helo"},
                {"Chocolate", 3, "Choate"},
                {"Chocolate", 1, "Ce"},
                {"Chocolate", 0, ""},
                {"Hello", 4, "Hellello"},
                {"Code", 4, "CodeCode"},
                {"Code", 2, "Code"}
        };
    }
}
