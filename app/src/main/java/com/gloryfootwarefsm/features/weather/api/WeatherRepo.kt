package com.gloryfootwarefsm.features.weather.api

import com.gloryfootwarefsm.base.BaseResponse
import com.gloryfootwarefsm.features.task.api.TaskApi
import com.gloryfootwarefsm.features.task.model.AddTaskInputModel
import com.gloryfootwarefsm.features.weather.model.ForeCastAPIResponse
import com.gloryfootwarefsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}