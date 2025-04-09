package com.example.aplikacjapogoda.data.repository

import com.example.aplikacjapogoda.data.api.WeatherApi
import com.example.aplikacjapogoda.data.model.WeatherResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WeatherRepository {

    private val api: WeatherApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(" ") //todo: znalezc w dokumentacji gdzie wziasc api
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(WeatherApi::class.java)
    }

    suspend fun getWeather(city: String, apiKey: String): WeatherResponse {
        return api.getWeather(city, apiKey)
    }
}