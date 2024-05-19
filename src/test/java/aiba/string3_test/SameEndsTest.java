package aiba.string3_test;

import com.digital_nomads.aiba.string1.HelloName;
import com.digital_nomads.aiba.string3.SameEnds;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameEndsTest {

    @Test(dataProvider = "SameEnds")
    public void sameEnds(String string,String expected){
        SameEnds sameEnds = new SameEnds();
        String result = sameEnds.sameEnds(string);
        Assert.assertEquals(result, expected);
    }


    @DataProvider(name = "SameEnds")
    public Object [][] SameEnds(){
        return new Object[][]{
                {"abXYab", "ab"}, {"xx", "x"},
                {"xxx", "x"}, {"xxxx", "xx"},
                {"javaXYZjava", "java"}, {"javajava", "java"},
                {"xavaXYZjava", ""}, {"Hello! and Hello!", "Hello!"},
                {"x", ""}, {"", ""}, {"abcb", ""}, {"mymmy", "my"}
        };
    }

}
