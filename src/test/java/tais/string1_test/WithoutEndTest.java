package tais.string1_test;

import com.digital_nomads.tais.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEndTest {

    @Test(dataProvider = "dPWithoutEndTest")
    public void withoutEndTest(String str1, String expected){
        WithoutEnd obj = new WithoutEnd();
        Assert.assertEquals(obj.withoutEnd(str1), expected);
    }

    @DataProvider
    public Object[][] dPWithoutEndTest(){
            return new Object[][]{
                    {"Hello", "ell"},
                    {"java", "av"},
                    {"coding", "odin"},
                    {"code", "od"},
                    {"ab", ""},
                    {"Chocolate!", "hocolate"},
                    {"kitten", "itte"},
                    {"woohoo", "ooho"}
                    };
            }

}
