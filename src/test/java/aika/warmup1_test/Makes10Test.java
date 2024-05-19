package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.Makes10;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Makes10Test {
    @Test(dataProvider = "makes10DP")
    public void testMakes10(int a,int b, boolean expected){
        Makes10 m = new Makes10();
        assertEquals(m.makes10(a,b),expected);
    }
    @DataProvider(name =  "makes10DP")
    public Object[][] makes10DP(){
        return new Object[][]{{9,10,true}, {9, 9, false},
                {1,9,true},
                {10,1,true},
                {10,10,true},
                {8,2,true},
                {8,3,false},
                {10,42,true},
                {12,-2,true}};
        }
    }

