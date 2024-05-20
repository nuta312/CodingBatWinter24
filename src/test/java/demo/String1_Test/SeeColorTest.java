package demo.String1_Test;

import com.digital_nomads.shirin.string1.SeeColor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeeColorTest {

    @Test(dataProvider = "testSee")
    public void testSeeColor(String str , String except){
        SeeColor see = new SeeColor();
        String s = see.seeColor(str);
        Assert.assertEquals(s,except);
    }

@DataProvider
    public Object[][] testSee(){
        return new Object[][]{
                {"redxx","red"},
                {"red", "red"},
                {"blueTimes","blue"},
                {"blue","blue"},
                {"",""},
                {"a" ,""}
        };
    }
}
