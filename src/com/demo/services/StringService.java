package com.demo.services;

import java.util.regex.Pattern;
import com.demo.beans.StringData;

public class StringService {

    public static boolean isAlphanumeric(StringData strData) {
        String input = strData.getValue();
        String regex = "^[a-zA-Z0-9]+$";
        return Pattern.matches(regex, input);
    }
}
