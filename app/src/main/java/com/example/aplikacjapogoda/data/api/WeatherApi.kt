package com.example.aplikacjapogoda.data.api

import com.example.aplikacjapogoda.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("weather")
    suspend fun getWeather(
        @Query("q") city: String,
        @Query("appid") apiKey: String
    ): WeatherResponse
}