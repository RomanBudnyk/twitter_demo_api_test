package com.twitterAPI;

import org.apache.commons.lang3.RandomStringUtils;


public class TestData {
    public static String tweet;
    static {
        int count = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        tweet = RandomStringUtils.random(count, useLetters, useNumbers);
    }

}
