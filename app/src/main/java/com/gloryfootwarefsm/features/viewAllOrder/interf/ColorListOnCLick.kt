package com.gloryfootwarefsm.features.viewAllOrder.interf

import com.gloryfootwarefsm.app.domain.NewOrderGenderEntity
import com.gloryfootwarefsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}