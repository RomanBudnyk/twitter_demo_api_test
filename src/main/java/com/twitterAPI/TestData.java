package com.twitterAPI;

import org.apache.commons.lang3.RandomStringUtils;


public class TestData {
    public static String tweet;
    public static String tweet_id_correct = "1104849491776233481";
    public static String tweet_id_incorrect = "1104849491776244875";

    static {
        tweet = RandomStringUtils.random(10, true, false);
    }
}
