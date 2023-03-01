package com.gloryfootwarefsm.features.activities.api

import com.gloryfootwarefsm.features.member.api.TeamApi
import com.gloryfootwarefsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}