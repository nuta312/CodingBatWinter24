package nargiza.warmup1_test;

import com.digital_nomads.nargiza.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumDoubleTest {

    SumDouble sumDouble = new SumDouble();

@DataProvider(name = "word")
    public Object[][] getSumDouble(){
    return new Object[][]{
            {1, 2, 3},
            {3, 2, 5},
            {2, 2, 8}
    };
}

@Test(dataProvider = "word")
    public void testSumDouble(int a, int b, int expected){
    Assert.assertEquals(sumDouble.sumDouble(a, b), expected);
}
}