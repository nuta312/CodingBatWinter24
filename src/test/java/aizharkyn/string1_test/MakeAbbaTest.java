package aizharkyn.string1_test;

import com.digital_nomads.aizharkyn.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbbaTest {

    @Test(dataProvider = "abbaProvider")
    public void testAbba(String a, String b , String expected){
        MakeAbba makeabba = new MakeAbba();
        Assert.assertEquals(makeabba.makeAbba(a,b), expected);
    }

    @DataProvider
    public Object [][] abbaProvider(){
        return new Object[][]{
                { "Hi", "Bye", "HiByeByeHi"},
                {"Yo", "Alice","YoAliceAliceYo"},
                {"What", "Up", "WhatUpUpWhat"},
                {"aaa", "bbb","aaabbbbbbaaa"},
                {"x", "y","xyyx"},
                {"x", "","xx"},
        };
    }


}
