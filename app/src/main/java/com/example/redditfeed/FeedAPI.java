package com.example.redditfeed;

import com.example.redditfeed.model.Feed;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FeedAPI {

    String BASE_URL = "https://www.reddit.com/r/";

    @GET("pics/.rss")
    Call<Feed> getFeed();
}
