package Gaukhar.String1;

import com.digital_nomads.gaukhar.string1.withoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class withoutEndTest {
    @Test
            (dataProvider = "wit")
    public void with(String str, String e){
        withoutEnd end =  new withoutEnd();
        String the = end.withoutEnd(str);
        Assert.assertEquals(the, e );
    }
    @DataProvider
    public Object [][] wit (){
        return new Object[][]{
                {"Hello","ell"},
                {"java","av"},
                {"coding","odin"},
                {"code","od"},
                {"ab",""},
                {"Chocolate!","hocolate"},
                {"kitten","itte"},
                {"woohoo","ooho"},
        };
    }
}
