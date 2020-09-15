package com.recepyesilkaya.recyclerviewtry.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class JobModel(
    val name:String,
    val job:String,
    val salary:String
) : Parcelable