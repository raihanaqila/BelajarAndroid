package com.example.belajarandroid.network

import com.example.belajarandroid.model.NewsData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val BASE_URL = "https://run.mocky.io/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsAPIService {
    @GET("v3/4a6b4002-e45f-4ffd-8b9e-508419c6ff0a")
    suspend fun getTopHeadline(): NewsData

    // untuk define API API yang lain
}

object Api {
    val newsApiService: NewsAPIService by lazy {
        retrofit.create(NewsAPIService::class.java)
    }
}