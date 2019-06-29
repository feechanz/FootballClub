package com.feechan.footballclub.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Feechan on 9/6/2018.
 */
@Parcelize
data class FootBallClub (val name: String?, val image: Int?, val description: String?) : Parcelable