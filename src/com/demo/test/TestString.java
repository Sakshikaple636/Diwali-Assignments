package com.demo.test;

import com.demo.beans.StringData;
import com.demo.services.StringService;

public class TestString {
    public static void main(String[] args) {
        StringData s1 = new StringData("Hello123");
        StringData s2 = new StringData("Hi@2025");

        System.out.println(s1.getValue() + " -> " + StringService.isAlphanumeric(s1));
        System.out.println(s2.getValue() + " -> " + StringService.isAlphanumeric(s2));
    }
}
