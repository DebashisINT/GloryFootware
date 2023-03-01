package com.gloryfootwarefsm.features.nearbyuserlist.api

import com.gloryfootwarefsm.app.Pref
import com.gloryfootwarefsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.gloryfootwarefsm.features.newcollection.model.NewCollectionListResponseModel
import com.gloryfootwarefsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}