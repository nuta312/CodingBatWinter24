package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.MiddleThree;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MiddleThreeTest {

    @Test(dataProvider = "middleThreeDataProvider")
    public void middleThreeTest(String str, String excepted) {

        var middleThree = new MiddleThree();
        assertEquals(middleThree.middleThree(str), excepted);
    }


    @DataProvider(name = "middleThreeDataProvider")
    public String[][] middleThreeDataProvider() {

        return new String[][]{

                {"Candy", "and"},
                {"and", "and"},
                {"Hi yet Hi", "yet"},
                {"java yet java", "yet"},
                {"XabcxyzabcX", "xyz"},
                {"Chocolate", "col"}
        };
    }

}