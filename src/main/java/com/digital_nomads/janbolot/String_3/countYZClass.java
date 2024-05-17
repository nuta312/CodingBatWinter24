package com.digital_nomads.janbolot.String_3;

public class countYZClass {
    public static void main(String[] args) {
        System.out.println(countYZ("!!day--yaz!!"));
    }
    public static int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String tempStr = str.substring(i, i + 1).toLowerCase();
            if (tempStr.equals("y") || tempStr.equals("z")) {
                if (i < str.length() - 1 && !Character.isLetter(str.charAt(i + 1))) {
                    count++;
                } else if (i == str.length() - 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
