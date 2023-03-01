package com.gloryfootwarefsm.features.viewAllOrder.interf

import com.gloryfootwarefsm.app.domain.NewOrderGenderEntity
import com.gloryfootwarefsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}