package Gaukhar.String1;



import com.digital_nomads.gaukhar.string1.makeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class makeAbbaTest {
    @Test
            (dataProvider = "mkeAbba" )
    public void testMake(String a, String b, String expected){
        makeAbba make = new makeAbba();
        String str = make.makeAbba(a,b);
        Assert.assertEquals(str,expected);
    }
    @DataProvider
    public Object [][] mkeAbba (){
        return new Object[][]{
                {"Hi", "Bye","HiByeByeHi"},
                {"Yo", "Alice", "YoAliceAliceYo"},
                {"What", "Up", "WhatUpUpWhat"},
                {"aaa", "bbb","aaabbbbbbaaa"},
                {"x", "y","xyyx"},
                {"x", "", "xx"},
                {"Bo", "Ya","BoYaYaBo"},
                {"Ya", "Ya","YaYaYaYa"}

        };
    }
}
