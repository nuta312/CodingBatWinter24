package demo.String1_Test;

import com.digital_nomads.shirin.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalfTest {

    @Test(dataProvider ="FirstHalf" )
    public void TestFirstHalf(String str , String except){
        FirstHalf firs = new FirstHalf();
        String a = firs.firstHalf(str);
        Assert.assertEquals(a,except);

    }
@DataProvider
    public Object [][] FirstHalf(){
        return  new Object[][]{
                {"WooHoo" ,"Woo"},
                {"HelloThere" ,"Hello"},
                {"abcdef" ,"abc"},
                {"ab" ,"a"},
                {"" , ""},
                {"0123456789" ,"01234"},
                {"kitten" ,"kit"}
        };
    }
}
