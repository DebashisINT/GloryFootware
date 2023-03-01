package com.gloryfootwarefsm.features.login.model.productlistmodel

import com.gloryfootwarefsm.app.domain.ModelEntity
import com.gloryfootwarefsm.app.domain.ProductListEntity
import com.gloryfootwarefsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}