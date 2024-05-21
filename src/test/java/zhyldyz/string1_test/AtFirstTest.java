package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.AtFirst;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AtFirstTest {

    AtFirst atFirst = new AtFirst();

    @Test(dataProvider = "atFirstDataProvider")
    void atFirstTest(String str, String excepted) {

        assertEquals(atFirst.atFirst(str), excepted);
    }

    @DataProvider(name = "atFirstDataProvider")
    public String[][] atFirstDataProvider(){
        return new String[][]{

                {"hello", "he"},
                {"hi", "hi"},
                {"h", "h@"},
                {"","@@"},
                {"kitten", "ki"},
                {"java","ja"},
                {"j", "j@"}

        };
    }
}