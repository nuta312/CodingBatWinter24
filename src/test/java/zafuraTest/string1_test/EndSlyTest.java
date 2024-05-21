package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.EndSly;
import com.digital_nomads.zafura.string1.MiddleTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndSlyTest {
    @Test(dataProvider = "ends")
    public void testEndSly(String str, boolean expected) {
        EndSly endSly = new EndSly();
        Assert.assertEquals(endSly.endsLy(str),expected);
    }
    @DataProvider
    public Object[][]ends(){
        return new Object[][]{
                {"oddly",true},
                {"y", false},
                {"",false},


        };
    }}


