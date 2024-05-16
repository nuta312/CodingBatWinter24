package almaz.string1_test;

import com.digital_nomads.almaz.string1.FirstHalf;
import com.digital_nomads.almaz.string1.WithoutEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEndTest {
    @Test(dataProvider = "WithoutEndTest")
    public void testWithoutEnd(String str, String expected){
        WithoutEnd withoutEnd = new WithoutEnd();
        String result = withoutEnd.withoutEnd(str);
        assert result.equals(expected);
    }

    @DataProvider
    public Object [][] WithoutEndTest() {
        return new Object[][]{
                {"Hello", "ell"},
                {"java", "av"},
                {"code", "od"},
                {"Chocolate!", "hocolate"},
                {"woohoo", "ooho"},
        };
    }
}
