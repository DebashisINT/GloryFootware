package com.gloryfootwarefsm.features.lead.api

import com.gloryfootwarefsm.features.NewQuotation.api.GetQuotListRegRepository
import com.gloryfootwarefsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}