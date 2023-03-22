package com.example.springjpa.util;

public class APIUtil {

    public static int convertStringToInt(String input) {
        int result = -1;
        try {
            result = Integer.parseInt(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static Long convertStringToLong(String input) {
        Long result = -1L;
        try {
            result = Long.parseLong(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
