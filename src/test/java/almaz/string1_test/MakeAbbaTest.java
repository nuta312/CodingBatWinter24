package almaz.string1_test;

import com.digital_nomads.almaz.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbbaTest {
    @Test(dataProvider = "MakeAbbaTest")
    public void testMakeAbba(String a, String b){
        MakeAbba makeAbba = new MakeAbba();
    //    Assert.assertEquals(makeAbba.makeAbba("Hi", "Bye"),"HiByeByeHi");
    }

    @DataProvider
    public Object [][] MakeAbbaTest(){
        return new Object[][]{
                {"Yo", "Alice"},
                {"What", "Up"},
                {"aaa", "bbb"},
                {"x", "y"},
                {"Bo", "Ya"},
                {"", "y"}
        };
    }
}
