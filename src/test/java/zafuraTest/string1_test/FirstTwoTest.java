package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.FirstTwo;
import com.digital_nomads.zafura.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwoTest {
    @Test(dataProvider = "First")
    public void testFirstTwo(String name, String expected) {
        FirstTwo firstTwo = new FirstTwo();
        Assert.assertEquals(firstTwo.firstTwo(name),expected);
    }
    @DataProvider
    public Object[][]First(){
        return new Object[][]{
                {"Hello", "He"},
                {"abcdefg","ab" },
                {"ab", "ab"},
                {"a","a"},
                {"",""},
                {"Kitten","Ki"}
        };
    }
}

