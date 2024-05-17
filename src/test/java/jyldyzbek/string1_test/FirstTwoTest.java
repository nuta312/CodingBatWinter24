package jyldyzbek.string1_test;

import com.digital_nomads.jyldyzbek.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwoTest {

    @Test(dataProvider = "firstTwo")
    public void firstTwo(String str, String str1){
        FirstTwo firstTwo = new FirstTwo();
        String result = firstTwo.firstTwo(str);
        Assert.assertEquals(result, str1);
    }

    @DataProvider
    public Object[][]firstTwo(){
        return  new Object[][]{
                {"Hello", "He"},
                {"abcdefg", "ab"},
                {"ab", "ab"},
                {"a", "a"},
                {"Kitten", "Ki"},
                {"hi", "hi"},
                {"hiya", "hi"},
        };
    }
}
