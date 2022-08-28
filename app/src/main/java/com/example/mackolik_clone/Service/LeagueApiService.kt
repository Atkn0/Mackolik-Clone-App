package com.example.mackolik_clone.Service

import com.example.mackolik_clone.Models.AlbumModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LeagueApiService {

    private val BASE_URL = "https://jsonplaceholder.typicode.com/"


    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api = retrofit.create(api::class.java)

    fun getDataService():Call<List<AlbumModel>>{
        return api.getLeagueNames()
    }


}