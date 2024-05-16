package com.digital_nomads.janar.string_1;

public class MiddleTwo {

    public String middleTwo(String str) {
        int length = str.length();
        if(length % 2 == 0){
            int middle = length / 2;
            return str.substring(middle - 1, middle + 1);
        } else {
            return "";
        }
    }

}
