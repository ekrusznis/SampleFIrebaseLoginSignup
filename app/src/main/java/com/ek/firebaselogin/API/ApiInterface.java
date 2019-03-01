package com.ek.firebaselogin.API;

import com.ek.firebaselogin.Models.JsonData;
import com.ek.firebaselogin.NewModels.SearchVidResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("?data=redtube.Videos.searchVideos&output=json&thumbsize=all")
    Call<SearchVidResponse> apiCall();

}
