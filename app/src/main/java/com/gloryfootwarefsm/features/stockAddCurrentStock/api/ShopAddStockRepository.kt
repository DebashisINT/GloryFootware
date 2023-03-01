package com.gloryfootwarefsm.features.stockAddCurrentStock.api

import com.gloryfootwarefsm.base.BaseResponse
import com.gloryfootwarefsm.features.location.model.ShopRevisitStatusRequest
import com.gloryfootwarefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.gloryfootwarefsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.gloryfootwarefsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.gloryfootwarefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}