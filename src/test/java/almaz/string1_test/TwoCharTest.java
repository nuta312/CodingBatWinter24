package almaz.string1_test;

import com.digital_nomads.almaz.string1.TwoChar;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoCharTest {
    @Test(dataProvider = "TwoCharTest")
    public void testTwoChar (String str, int index){
        TwoChar twoChar = new TwoChar();
    }

    @DataProvider
    public Object [][] TwoCharTest(){
        return new Object[][]{
                {"java", 0},
                {"java", 2},
                {"java", -1},
                {"Hello", 99},
                {"Hello", 4},
                {"Hello", -1},
                {"yay", 0},
        };
    }
}
