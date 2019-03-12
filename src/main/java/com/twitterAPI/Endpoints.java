package com.twitterAPI;

import static com.twitterAPI.TestData.tweet_id_correct;
import static com.twitterAPI.TestData.tweet_id_incorrect;

public class Endpoints {
    public static final String BASE_URI = "https://api.twitter.com/1.1/";
    public static final String POST_STATUSES_UPDATE = "statuses/update.json";
    public static final String POST_STATUSES_RETWEET = "statuses/retweet/" + tweet_id_correct + ".json";
    public static final String POST_STATUSES_RETWEET_WITH_WRONG_ID = "statuses/retweet/" + tweet_id_incorrect + ".json";
}
