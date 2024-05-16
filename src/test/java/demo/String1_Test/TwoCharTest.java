package demo.String1_Test;

import com.digital_nomads.shirin.string1.TwoChar;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoCharTest {

    @Test(dataProvider ="TwoChar" )
    public void testTwoChar(String str , int index , String except){
        TwoChar two = new TwoChar();
        String a = two.twoChar(str,index);
        Assert.assertEquals(a,except);
    }


    @DataProvider
    public Object [][] TwoChar(){
        return new Object[][]{
                {"java", 0 ,"ja"},
                {"java", 2 ,"va"},
                {"java", 3 , "ja"},
                {"java", 4, "ja"},
                {"java", -1 ,"ja"}
        };
    }
}
