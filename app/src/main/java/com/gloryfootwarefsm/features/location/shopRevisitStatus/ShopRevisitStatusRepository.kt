package com.gloryfootwarefsm.features.location.shopRevisitStatus

import com.gloryfootwarefsm.base.BaseResponse
import com.gloryfootwarefsm.features.location.model.ShopDurationRequest
import com.gloryfootwarefsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}