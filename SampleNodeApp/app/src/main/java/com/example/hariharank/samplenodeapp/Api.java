package com.example.hariharank.samplenodeapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "https://bitnami-39xfosdmxa.appspot.com";

    @GET("get-items")
    Call<List<Phone>> getResult(@Query("manufacturer")String manufacturer,
                                @Query("model")String model,
                                @Query("min-price")String min_price,
                                @Query("max-price")String max_price);

    @GET("get-items")
    Call<List<Phone>> getResult();

    @GET("Buy")
    Call<Buy> getBuy(@Query("model")String model,
                        @Query("username")String username,
                        @Query("qty")String quantity );

    @GET("getSalesRecords")
    Call<List<Buy>> getSales();

}
