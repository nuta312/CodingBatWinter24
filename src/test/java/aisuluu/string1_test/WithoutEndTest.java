package aisuluu.string1_test;

import digital_nomads.aisuluu.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEndTest {
    @Test (dataProvider = "without")
    public void testWithoutEnd (String str, String exp){
        WithoutEnd withoutend = new WithoutEnd();
        Assert.assertEquals(withoutend.WithoutEnd(str),exp);
    }
    @DataProvider
    public String[][] without(){
        return new String[][]{
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
