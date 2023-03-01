package com.gloryfootwarefsm.features.dashboard.presentation.api.dayStartEnd

import com.gloryfootwarefsm.features.stockCompetetorStock.api.AddCompStockApi
import com.gloryfootwarefsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}