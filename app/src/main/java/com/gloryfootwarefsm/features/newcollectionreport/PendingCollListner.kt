package com.gloryfootwarefsm.features.newcollectionreport

import com.gloryfootwarefsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}