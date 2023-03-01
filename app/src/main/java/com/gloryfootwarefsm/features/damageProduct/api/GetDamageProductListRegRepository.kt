package com.gloryfootwarefsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.gloryfootwarefsm.app.FileUtils
import com.gloryfootwarefsm.base.BaseResponse
import com.gloryfootwarefsm.features.NewQuotation.model.*
import com.gloryfootwarefsm.features.addshop.model.AddShopRequestData
import com.gloryfootwarefsm.features.addshop.model.AddShopResponse
import com.gloryfootwarefsm.features.damageProduct.model.DamageProductResponseModel
import com.gloryfootwarefsm.features.damageProduct.model.delBreakageReq
import com.gloryfootwarefsm.features.damageProduct.model.viewAllBreakageReq
import com.gloryfootwarefsm.features.login.model.userconfig.UserConfigResponseModel
import com.gloryfootwarefsm.features.myjobs.model.WIPImageSubmit
import com.gloryfootwarefsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}