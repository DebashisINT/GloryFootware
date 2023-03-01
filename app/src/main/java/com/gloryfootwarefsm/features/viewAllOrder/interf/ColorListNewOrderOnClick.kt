package com.gloryfootwarefsm.features.viewAllOrder.interf

import com.gloryfootwarefsm.app.domain.NewOrderColorEntity
import com.gloryfootwarefsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}