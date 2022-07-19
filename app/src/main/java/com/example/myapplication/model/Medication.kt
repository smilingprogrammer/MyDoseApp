package com.example.myapplication.model

import android.os.Parcelable
import com.example.myapplication.util.DailyTimes
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Medication(
    val id: Int,
    val name: String,
    val dosage: Int,
    val recurrence: String,
    val endDate: Date,
    val timesOfDay: List<DailyTimes>
): Parcelable