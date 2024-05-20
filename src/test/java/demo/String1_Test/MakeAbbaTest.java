package demo.String1_Test;

import com.digital_nomads.shirin.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAbbaTest {
    @Test ( dataProvider = "makeTest")
    public void testMakeAbba(String a, String b, String expect) {
        MakeAbba make = new MakeAbba();
        String result = make.makeAbba(a, b);
        Assert.assertEquals(result, expect);

    }

@DataProvider
    public Object[][] makeTest() {
        return new Object[][]{{
                "Hi", "Bye", "HiByeByeHi"
        }, {
                "Yo", "Alice", "YoAliceAliceYo"
        },{
                "What", "Up" , "WhatUpUpWhat"
        },{
                "aaa", "bbb" ,  "aaabbbbbbaaa"
        },{
                "x", "y" , "xyyx"
        },{
                "x", "" , "xx"
        }, {
                "", "y" , "yy"
        },{
                "Bo", "Ya", "BoYaYaBo"
        },{
                "Ya", "Ya" , "YaYaYaYa"
        }

        };
    }
}
