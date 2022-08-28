package com.example.mackolik_clone.Service

import com.example.mackolik_clone.Models.AlbumModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.HeaderMap

interface api {
    //https://api-football-beta.p.rapidapi.com/leagues?id=61
    //https://api-football-v1.p.rapidapi.com/v3/leagues
    //BASE_URL = https://api-football-v1.p.rapidapi.com/v3/
    // https://api-football-beta.p.rapidapi.com/leagues
    //API_KEY = 004539b61emshc0462a091ea5c9fp15faf1jsn17216ff0eb63
    //BASE_URL_2 = https://jsonplaceholder.typicode.com/

    @GET("leagues")
    fun getLeagueNames():Call<AlbumModel>




}