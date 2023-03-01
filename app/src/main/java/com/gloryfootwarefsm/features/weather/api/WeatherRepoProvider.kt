package com.gloryfootwarefsm.features.weather.api

import com.gloryfootwarefsm.features.task.api.TaskApi
import com.gloryfootwarefsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}