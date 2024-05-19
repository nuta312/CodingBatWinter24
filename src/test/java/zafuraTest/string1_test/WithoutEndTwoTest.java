package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.TheEnd;
import com.digital_nomads.zafura.string1.WithoutEndTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEndTwoTest {
    @Test(dataProvider = "endTwo")
    public void testWithioutEndTwo(String str, String expected) {
        WithoutEndTwo withoutEndTwo= new WithoutEndTwo();
        Assert.assertEquals(withoutEndTwo.withouEnd2(str),expected);
    }
    @DataProvider
    public Object[][]endTwo(){
        return new Object[][]{
                {"Hello","ell"},
                {"abc","b"},
                {"",""},


        };
}}
