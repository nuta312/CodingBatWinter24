package eldorados_test.str1.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _4MakeOutWord {
@Test(dataProvider = MOWT)



    @DataProvider
    public void Object [][] MOWT(){
        return new Object [][]{
                {"<<>>","Yay","<<Yay>>"},
                {"<<>>","WooHoo","<<WooHoo>>"},
                {"[[]]","word","[[word]]"},
        }
    }
}
