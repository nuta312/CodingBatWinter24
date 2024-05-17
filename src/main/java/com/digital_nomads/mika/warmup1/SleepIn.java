package com.digital_nomads.mika.warmup1;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday==false ||vacation==true) {
            return true;
        } else {
            return false;
        }

    }
}
