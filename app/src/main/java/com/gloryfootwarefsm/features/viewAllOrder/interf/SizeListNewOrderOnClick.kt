package com.gloryfootwarefsm.features.viewAllOrder.interf

import com.gloryfootwarefsm.app.domain.NewOrderProductEntity
import com.gloryfootwarefsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}