package com.digital_nomads.aima.warmup1;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
}
