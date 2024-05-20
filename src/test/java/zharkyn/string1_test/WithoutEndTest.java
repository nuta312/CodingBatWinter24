package zharkyn.string1_test;

import com.digital_nomads.zharkyn.string1.WithoutEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WithoutEndTest {

    @Test (dataProvider = "withoutEndDataProvider")
    public void withoutEndTest(String str, String expected){
        WithoutEnd withoutEnd = new WithoutEnd();
        assertEquals(withoutEnd.withoutEnd(str), expected);
    }

    @DataProvider(name = "withoutEndDataProvider")
    public Object[][] withoutEndDataProvider(){
        return new Object[][] {
                {"Hello","ell"},
                {"java","av"},
                {"coding","odin"},
                {"code","od"},
                {"ab",""},
                {"Chocolate!","hocolate"},
                {"kitten","itte"},
                {"woohoo","ooho"}
        };

    }

}
