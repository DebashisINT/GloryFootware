package com.gloryfootwarefsm.features.location.shopRevisitStatus

import com.gloryfootwarefsm.features.location.shopdurationapi.ShopDurationApi
import com.gloryfootwarefsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}