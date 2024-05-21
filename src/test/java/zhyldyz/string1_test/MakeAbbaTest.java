package zhyldyz.string1_test;

import com.digital_nomads.zhyldyz.string1.HelloName;
import com.digital_nomads.zhyldyz.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MakeAbbaTest {

    MakeAbba makeAbba = new MakeAbba();

    @Test(dataProvider = "makeAbbaDataProvider")
    public void makeAbbaTest(String a,String b, String expected){
        Assert.assertEquals(makeAbba.makeAbba(a, b), expected);
    }
    @DataProvider(name = "makeAbbaDataProvider")
    public Object [][] makeAbbaDataProvider(){
        return new Object[][]{
                {"Hi", "Bye", "HiByeByeHi"},
                {"Yo", "Alice", "YoAliceAliceYo"},
                {"What", "Up", "WhatUpUpWhat"},
                {"aaa", "bbb", "aaabbbbbbaaa"},
                {"x", "", "xx"}
        };
    }

}