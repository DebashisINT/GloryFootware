package com.gloryfootwarefsm.features.survey.api

import com.gloryfootwarefsm.features.photoReg.api.GetUserListPhotoRegApi
import com.gloryfootwarefsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}