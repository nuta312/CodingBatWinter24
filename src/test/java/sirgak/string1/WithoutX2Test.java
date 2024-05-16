package sirgak.string1;

import com.digital_nomads.s1rgak.string1.WithoutX2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutX2Test {
        @Test
                (dataProvider = "WithOutX2Test")
        public void testWitoutX2(String str, String expected){
            WithoutX2 withoutX2 = new WithoutX2();
            String result = withoutX2.withoutX2(str);
            assert result.equals(expected);
    }
    @DataProvider
    public Object [][] WithOutX2Test(){
        return new Object[][]{
                {"xHi", "Hi"},
                {"Hxi", "Hi"},
                {"Hi", "Hi"},
                {"xxHi", "Hi"},
                {"xx",""}
        };
    }
}
