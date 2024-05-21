package zafuraTest.string1_test;

import com.digital_nomads.zafura.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbbaTest {
    @Test(dataProvider = "makeAb")
    public void makeAbbaTest(String a,String b, String expected){
        MakeAbba makeAbba = new MakeAbba();
        Assert.assertEquals(makeAbba.makeAbba(a,b), expected);



    }
    @DataProvider
    public Object[][]makeAb(){
        return new Object[][]{
                {"Hi", "Bye","HiByeByeHi"},
                {"Yo", "Alice", "YoAliceAliceYo" },
                {"What", "Up","WhatUpUpWhat"},
                {"aaa", "bbb","aaabbbbbbaaa"},
                {"x", "y","xyyx"},
                {"x", "", "xx"},
        };
}}
