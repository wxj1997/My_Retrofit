package com.example.wxj.my_retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by wxj on 2018/4/25.
 */

public class RetrofitUtil {

    public static void requestGet(Callback<String> callback) {
        //创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2/")
                .addConverterFactory(ScalarsConverterFactory.create()).build();
        //创建ApiService对象
        ApiService apiService=retrofit.create(ApiService.class);
        //创建Call对象
        Call<String> call=apiService.apiRequestGet("Get");
        call.enqueue(callback);
    }

    public static void requestPost(Callback<String> callback) {
        //创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2/")
                .addConverterFactory(ScalarsConverterFactory.create()).build();
        //创建ApiService对象
        ApiService apiService=retrofit.create(ApiService.class);
        //创建Call对象
        Call<String> call=apiService.apiRequestPost("Post");
        call.enqueue(callback);
    }
}
