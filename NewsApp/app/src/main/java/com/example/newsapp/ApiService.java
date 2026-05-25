package com.example.newsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("api/1/latest")
    Call<NewsResponse> getHeadlines(
            @Query("apikey") String apiKey,
            @Query("language") String language
    );
}