package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.Or35;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Or35Test {
    @Test(dataProvider = "or35DataProvider")
    public void  testOr35(int n, boolean excepted){
        Or35 or35 = new Or35();
        assertEquals(or35.or35(n),excepted);
    }
@DataProvider(name = "or35DataProvider")
    public Object[][] or35DataProvider(){
        return new Object[][]{{3,true},
                {10,true},
                {8,false},
                {15, true},
                {5, true},
                {100,true},
                {101, false},
                {121, false},
                {123,true}};
}
}