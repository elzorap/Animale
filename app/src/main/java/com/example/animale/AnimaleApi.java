package com.example.animale;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AnimaleApi {

    @GET("v3/6672a746-1042-46cf-855d-355939a99e6c")
    Call<Response> getAnimale();
}
