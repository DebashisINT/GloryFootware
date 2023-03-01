package com.gloryfootwarefsm.features.orderList.model

import com.gloryfootwarefsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}