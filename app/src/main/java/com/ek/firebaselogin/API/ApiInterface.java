package com.ek.firebaselogin.API;

import com.ek.firebaselogin.Models.JsonData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("data.json")
    Call<JsonData> apiCall();

}
