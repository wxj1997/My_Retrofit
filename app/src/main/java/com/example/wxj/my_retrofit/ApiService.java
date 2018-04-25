package com.example.wxj.my_retrofit;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by wxj on 2018/4/25.
 */

public interface ApiService {
    @GET("get.php")
    Call<String> apiRequestGet(@Query("key") String key);

    @FormUrlEncoded
    @POST("post.php")
    Call<String> apiRequestPost(@Field("key") String key);
}
