package com.gloryfootwarefsm.features.viewAllOrder.interf

import com.gloryfootwarefsm.app.domain.NewOrderGenderEntity
import com.gloryfootwarefsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}