package com.twitterAPI;

import io.restassured.authentication.OAuthSignature;

import static com.twitterAPI.Endpoints.BASE_URI;
import static io.restassured.RestAssured.given;

public class Methods {
    public static void retweetTweet(String consumerKey, String consumerSecret, String accessToken, String tokenSecret, String url, int status) {
        given().auth().oauth(consumerKey, consumerSecret, accessToken, tokenSecret, OAuthSignature.HEADER).
                log().all().
                when().post(BASE_URI + url).
                then().assertThat().statusCode(status).log().body();
    }
}
