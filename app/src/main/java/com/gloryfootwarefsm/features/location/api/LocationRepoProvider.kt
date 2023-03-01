package com.gloryfootwarefsm.features.location.api

import com.gloryfootwarefsm.features.location.shopdurationapi.ShopDurationApi
import com.gloryfootwarefsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}