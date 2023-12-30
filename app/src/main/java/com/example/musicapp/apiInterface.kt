package com.example.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface apiInterface {

    @Headers("X-RapidAPI-Key: 25b3f3a1b6msh806e4aff84e77dbp1e222fjsn0e7f53d4cd06", "X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query: String):Call<MyData>
}