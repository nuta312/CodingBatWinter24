package Gaukhar.String1;



import com.digital_nomads.gaukhar.string1.firstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class firstTwoTest {
    @Test
            (dataProvider = "first")
    public void two (String str, String e){
        firstTwo n = new firstTwo();
        String m = n.firstTwo(str);
        Assert.assertEquals(m , e);
    }
    @DataProvider
    public Object [][] first (){
            return new  Object [][]{
                    {"Hello","He"},
                    {"abcdefg", "ab"},
                    {"ab","ab"},
                    {"a","a"},
                    {"",""},
                    {"Kitten","Ki"},
                    {"hi","hi"},
                    {"hiya","hi"},

        };
    }
}
