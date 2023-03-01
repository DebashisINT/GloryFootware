package com.gloryfootwarefsm.features.meetinglist.model

import com.gloryfootwarefsm.base.BaseResponse
import com.gloryfootwarefsm.features.location.model.MeetingDurationDataModel
import java.io.Serializable

/**
 * Created by Saikat on 21-01-2020.
 */
class MeetingListResponseModel : BaseResponse(), Serializable {
    var meeting_list: ArrayList<MeetingDurationDataModel>? = null
}