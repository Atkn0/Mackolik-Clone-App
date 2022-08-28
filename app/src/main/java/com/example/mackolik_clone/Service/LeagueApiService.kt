package com.example.mackolik_clone.Service

import com.example.mackolik_clone.Models.AlbumModel
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.security.Key

class LeagueApiService {



    private val BASE_URL = "https://api-football-v1.p.rapidapi.com/v3/"
    private val client = OkHttpClient.Builder().apply {
        addInterceptor(myInceptor())
    }.build()

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    val api = retrofit.create(api::class.java)

    fun getHeaderMap():Map<String,String>{
        val headerMap = mutableMapOf<String,String>()
        headerMap["X-RapidAPI-Host"] = "api-football-beta.p.rapidapi.com"
        headerMap["x-rapidapi-key"] = "accec8c088mshbf0e0e2ac5fc7b8p182e98jsn7c5d17b3e42b"
        return headerMap

    }

    fun getDataService():Call<AlbumModel>{
        return api.getLeagueNames()

    }




}