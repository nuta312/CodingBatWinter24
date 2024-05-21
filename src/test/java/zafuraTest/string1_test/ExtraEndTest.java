package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.ExtraEnd;
import com.digital_nomads.zafura.string1.MakeOutWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEndTest {
    @Test(dataProvider = "end")
    public void ExtraEndTest(String str1,String expected){
        ExtraEnd extraEnd = new ExtraEnd();
        Assert.assertEquals(extraEnd.extraEnd(str1),expected);
    }
    @DataProvider
    public Object[][]end(){
        return new Object[][]{
                {"Hello","lololo"},
                {"ab","ababab" },
                {"Hi","HiHiHi"},
                {"Candy","dydydy"},
                {"Code","dedede"},

        };
    }}

