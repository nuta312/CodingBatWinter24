package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.LeftTwo;
import com.digital_nomads.zafura.string1.RightTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RightTwoTest {
    @Test(dataProvider = "right")
    public void testRightTwo(String str, String expected) {
        RightTwo rightTwo = new RightTwo();
        Assert.assertEquals(rightTwo.right2(str),expected);
    }
    @DataProvider
    public Object[][]right(){
        return new Object[][]{
                {"Hello","loHel"},
                {"java","vaja"},
                {"12345", "45123"},


        };
    }
}
