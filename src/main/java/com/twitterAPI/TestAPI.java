package com.twitterAPI;


import io.restassured.authentication.OAuthSignature;
import org.junit.jupiter.api.Test;

import static com.twitterAPI.Codes.NOT_FOUND;
import static com.twitterAPI.Codes.OK;
import static com.twitterAPI.Credentials.*;
import static com.twitterAPI.Endpoints.*;
import static com.twitterAPI.Methods.retweetTweet;
import static com.twitterAPI.TestData.tweet;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


public class TestAPI {

    @Test
    public void postTweet() {
        given().auth().oauth(CONSUMER_KEY, CONSUMER_SECRET, ACCESS_TOKEN, TOKEN_SECRET, OAuthSignature.HEADER).
                param("status", tweet).log().all().
                when().post(BASE_URI + POST_STATUSES_UPDATE).
                then().assertThat().statusCode(OK).
                assertThat().body("text", equalTo(tweet)).log().body();
    }

    @Test
    public void retweetTweetWithCorrectID() {
        retweetTweet(CONSUMER_KEY, CONSUMER_SECRET, ACCESS_TOKEN, TOKEN_SECRET, POST_STATUSES_RETWEET, OK);
    }

    @Test
    public void retweetTweetWithWrongID() {
        retweetTweet(CONSUMER_KEY, CONSUMER_SECRET, ACCESS_TOKEN, TOKEN_SECRET, POST_STATUSES_RETWEET_WITH_WRONG_ID, NOT_FOUND);
    }
}
