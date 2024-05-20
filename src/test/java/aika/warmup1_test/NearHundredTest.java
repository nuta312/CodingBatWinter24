package aika.warmup1_test;

import com.digital_nomads.aika.warmup1.NearHundred;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NearHundredTest {
    @Test(dataProvider = "NearHundredDP")
    public void testNearHundred(int n,boolean excepted){
        NearHundred nh = new NearHundred();
        assertEquals(nh.nearHundred(n),excepted);
    }
    @DataProvider(name = "NearHundredDP")
    public Object[][] nearHundred(){
        return new Object[][]{{93,true},
                {90,true},
                {89,false},
                {110,true},
                {111,false},
                {121,false},
                {-101,false},
                {-209,false},
                {190,true},
                {209,true},
                {0,false},
                {5,false},
                {-50,false},
                {191,true}};
    }

}