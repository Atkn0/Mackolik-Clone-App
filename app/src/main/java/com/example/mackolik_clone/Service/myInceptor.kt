package com.example.mackolik_clone.Service

import okhttp3.Interceptor
import okhttp3.Response

class myInceptor:Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("X-RapidAPI-Host","api-football-beta.p.rapidapi.com")
            .addHeader("x-rapidapi-key","accec8c088mshbf0e0e2ac5fc7b8p182e98jsn7c5d17b3e42b")
            .build()
        return chain.proceed(request)
    }
}