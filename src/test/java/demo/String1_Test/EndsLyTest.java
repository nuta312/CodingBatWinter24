package demo.String1_Test;

import com.digital_nomads.shirin.string1.EndsLy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndsLyTest {
    @Test(dataProvider ="EndLy")
    public  void  TestEndLy(String str , boolean except){
        EndsLy ly = new EndsLy();
       boolean a = ly.endsLy(str);
        Assert.assertEquals(a , except);
    }

@DataProvider
    public Object [][] EndLy(){
        return new  Object[][] {
                {"oddly" ,true },
                {"y" , false},
                {"oddy" ,false},
                {"oddl" , false},
                {"olydd" , false },
                {"ly" , true},
                {"" ,false},
                {"falsey" ,false},
                {"evenly" , true}
        };
    }
}
