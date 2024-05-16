package com.digital_nomads.aizada.warmup1;

public class SleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == false) {
            return false;
        } else {
            return true;
        }
    }
}
