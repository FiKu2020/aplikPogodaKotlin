package com.example.aplikacjapogoda.data.repository

import com.example.aplikacjapogoda.data.api.WeatherApiClient
import com.example.aplikacjapogoda.data.model.WeatherResponse
import retrofit2.Response

class WeatherRepository {

    private val api = WeatherApiClient.weatherApi

    suspend fun getWeather(city: String, apiKey: String): Response<WeatherResponse> {
        return api.getWeather(city, apiKey)
    }
}
