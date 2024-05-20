package demo.String1_Test;

import com.digital_nomads.shirin.string1.MiddleThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleThreeTest {

    @Test(dataProvider = "MiddleThree")
    public void TestMiddle(String str , String except){
        MiddleThree middle = new MiddleThree();
        String s = middle.middleThree(str);
        Assert.assertEquals(s,except);
    }

@DataProvider
    public  Object[][] MiddleThree(){
        return new Object[][] {
                {"Candy" ,"and" },
                {"and" ,"and" },
                {"solving" ,"lvi"},
                {"Hi yet Hi" , "yet"},
                {"java yet java" , "yet"},
                {"Chocolate" ,"col"},

        };
    }
}
