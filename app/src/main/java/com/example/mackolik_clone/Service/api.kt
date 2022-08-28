package com.example.mackolik_clone.Service

import com.example.mackolik_clone.Models.AlbumModel
import retrofit2.Call
import retrofit2.http.GET

interface api {

    //BASE_URL = https://api-football-v1.p.rapidapi.com/v3/
    //API_KEY = 004539b61emshc0462a091ea5c9fp15faf1jsn17216ff0eb63
    //BASE_URL_2 = https://jsonplaceholder.typicode.com/

    @GET("albums")
    fun getLeagueNames():Call<List<AlbumModel>>


}