package aika.string1_test;

import com.digital_nomads.aika.string1.NonStart;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NonStartTest {

        @Test(dataProvider = "nonStartDataProvider")
        public void nonStartTest(String a, String b, String expected) {

            NonStart nonStart = new NonStart();
            assertEquals(nonStart.nonStart (a, b), expected);
        }


        @DataProvider(name = "nonStartDataProvider")
        public String[][] nonStartDataProvider() {

            return new String[][]{

                    {"shotl", "java", "hotlava"},
                    {"ab", "xy", "by"},
                    {"ab", "x", "b"},
                    {"x", "ac", "c"},
                    {"a", "x", ""},
                    {"kit", "kat", "itat"}
            };
        }
    }

