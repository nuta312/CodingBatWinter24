package com.digital_nomads.aijan.warmup1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour > 0 && hour < 7 || hour > 20 && hour <= 23);
    }
}
