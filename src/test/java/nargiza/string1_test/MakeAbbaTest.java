package nargiza.string1_test;

import com.digital_nomads.nargiza.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class MakeAbbaTest {

    MakeAbba makeAbba = new MakeAbba();

    @DataProvider(name = "tagMakeAbba")
    public Object[][] tagMakeAbba(){
        return new Object[][]{
                {"Hi", "Bye", "HiByeByeHi"},
                {"Yo", "Alice", "YoAliceAliceYo"},
                {"What", "Up", "WhatUpUpWhat"}
        };
    }

    @Test(dataProvider = "tagMakeAbba")
    public void testMakeAbba(String a, String b, String expected){
        String result = makeAbba.makeAbba(a, b);
        Assert.assertEquals(result, expected);
    }
}
