package demo.String1_Test;

import com.digital_nomads.shirin.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwoTest {

    @Test(dataProvider = "FirstTwo")
    public void TestFirs(String str , String except){
        FirstTwo two = new FirstTwo();
        String a = two.firstTwo(str);
        Assert.assertEquals(a , except);
    }

@DataProvider
    public Object[][] FirstTwo (){
        return new Object[][]{
                {"Hello" ,"He"},
                {"abcdefg" , "ab"},
                {"",""},
                {"Kitten" , "Ki"}
        };
    }
}
