package jyldyzbek.string1_test;

import com.digital_nomads.jyldyzbek.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbbaTest {



    @Test(dataProvider = "MakeAbba")

    public void makeAbbaTest(String str, String str1, String str3) {
        MakeAbba makeAbba = new MakeAbba();
        String result = makeAbba.makeAbba(str, str1);
        Assert.assertEquals(result, str3);
    }

    @DataProvider
    public Object[][] MakeAbba() {
        return new Object[][]{
                {"Yo", "Alice", "YoAliceAliceYo"},
                {"What", "Up", "WhatUpUpWhat"},
                {"aaa", "bbb", "aaabbbbbbaaa"},
                {"x", "y", "xyyx"},
                {"Bo", "Ya", "BoYaYaBo"},
                {"", "y", "yy"}
        };
    }
}