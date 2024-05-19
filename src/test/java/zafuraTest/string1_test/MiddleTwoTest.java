package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.MiddleTwo;
import com.digital_nomads.zafura.string1.WithoutEndTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleTwoTest {
    @Test(dataProvider = "middle")
    public void testMiddleTwo(String str, String expected) {
        MiddleTwo middleTwo= new MiddleTwo();
        Assert.assertEquals(middleTwo.middleTwo(str),expected);
    }
    @DataProvider
    public Object[][]middle(){
        return new Object[][]{
                {"string","ri"},
                {"code", "od"},
                {"0123456789","45"},


        };
    }}


