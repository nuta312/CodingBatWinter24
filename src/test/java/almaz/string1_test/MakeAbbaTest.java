package almaz.string1_test;

import com.digital_nomads.almaz.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbbaTest {
    @Test(dataProvider = "MakeAbbaTest")
    public void testMakeAbba(String a, String b, String expect){
        MakeAbba makeAbba = new MakeAbba();
String result = makeAbba.makeAbba(a,b);
Assert.assertEquals(result,expect);
     //  Assert.assertEquals(makeAbba.makeAbba("Hi", "Bye"),"HiByeByeHi");
    }

    @DataProvider
    public Object [][] MakeAbbaTest(){
        return new Object[][]{
                {"Yo", "Alice","YoAliceAliceYo" },
                {"What", "Up","WhatUpUpWhat"},
                {"aaa", "bbb","aaabbbbbbaaa"},
                {"x", "y","xyyx"},
                {"Bo", "Ya","BoYaYaBo"},
                {"", "y","yy"}
        };
    }
}
