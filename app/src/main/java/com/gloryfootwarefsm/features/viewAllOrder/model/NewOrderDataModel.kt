package com.gloryfootwarefsm.features.viewAllOrder.model

import com.gloryfootwarefsm.app.domain.NewOrderColorEntity
import com.gloryfootwarefsm.app.domain.NewOrderGenderEntity
import com.gloryfootwarefsm.app.domain.NewOrderProductEntity
import com.gloryfootwarefsm.app.domain.NewOrderSizeEntity
import com.gloryfootwarefsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}
