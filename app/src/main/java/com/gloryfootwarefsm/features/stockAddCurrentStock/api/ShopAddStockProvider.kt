package com.gloryfootwarefsm.features.stockAddCurrentStock.api

import com.gloryfootwarefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.gloryfootwarefsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}