package jyldyzbek.string1_test;

import com.digital_nomads.jyldyzbek.string1.WithoutEnd;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEndTest {
    @Test(dataProvider = "withoutEnd")
    public void withoutEndTest(String str, String str1){
        WithoutEnd withoutEnd = new WithoutEnd();
        String result = withoutEnd.withoutEnd(str);
        assert result.equals(str1);
    }

    @DataProvider
    public Object[][]withoutEnd() {
        return new Object[][]{
                {"Hello", "ell"},
                {"java", "av"},
                {"coding", "odin"},
                {"code", "od"},
                {"ab", ""},
                {"Chocolate!", "hocolate"},
                {"kitten", "itte"},
                {"woohoo", "ooho"},
        };
        }
    }
