package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.EndSly;
import com.digital_nomads.zafura.string1.NTwise;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NTwiseTest {
    @Test(dataProvider = "ntwise")
    public void testNtwise(String str, int n,String expected) {
        NTwise nTwise = new NTwise();
        Assert.assertEquals(nTwise.nTwice(str,n),expected);
    }
    @DataProvider
    public Object[][]ntwise(){
        return new Object[][]{
                {"Hello",2, "Helo"},
                {"Chocolate", 3,"Choate"},
                {"Code", 2, "Code"},


        };
}}
