package com.digital_nomads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class MonkeyTrouble {
        public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            if (!aSmile && bSmile) {
                return false;
            } else if (aSmile && !bSmile) {
                return false;
            }else if (!aSmile && !bSmile) {
                return true;
            } else {
                return true;
            }
        }
    }
}