package com.gloryfootwarefsm.features.photoReg.present

import com.gloryfootwarefsm.app.domain.ProspectEntity
import com.gloryfootwarefsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}