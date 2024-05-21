package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.FirstHalf;
import com.digital_nomads.zafura.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {
    @Test(dataProvider = "Half")
    public void testFirstHalf(String str, String expected) {
        FirstHalf firstHalf= new FirstHalf();
        Assert.assertEquals(firstHalf.firstHalf(str),expected);
    }
    @DataProvider
    public Object[][]Half(){
        return new Object[][]{
                {"WooHoo","Woo"},
                {"HelloThere","Hello" },
                {"abcdef", "abc"},
                {"ab","a"},
                {"",""},
                {"0123456789","01234"}
        };
    }
}

