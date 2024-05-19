package aima.string1_test;

import com.digital_nomads.aima.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEndTest {

    @Test (dataProvider = "words")
    public void withoutEnd (String str, String expected){
        WithoutEnd withoutEnd = new WithoutEnd();
        Assert.assertEquals(withoutEnd.withoutEnd(str), expected);
    }
    @DataProvider (name = "words")
    public Object[][] provideWords(){
        return new Object[][]{
                {"Hello", "ell"},
                {"java", "av"},
                {"coding", "odin"},
                {"code", "od"},
                {"ab", ""},
                {"Chocolate!", "hocolate"},
                {"kitten", "itte"},
                {"woohoo", "ooho"},
        };
    }
}
