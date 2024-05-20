package demo.String1_Test;

import com.digital_nomads.shirin.string1.LastChars;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastCharsTest {

    @Test(dataProvider = "Last")
    public void TestLast(String a , String b , String except){
        LastChars last = new LastChars();
        String str = last.lastChars(a , b );
        Assert.assertEquals(str , except);
    }

@DataProvider
    public Object [][] Last(){
        return new Object[][] {
                {"last", "chars" , "ls"} ,
                {"yo", "java" , "ya"},
                {"hi", "" , "h@"},
                {"", "hello" , "@o"},
                {"", "" , "@@"},
                {"kitten", "hi" , "ki"},
                {"kitten", "" ,"k@" }
        };
    }
}
