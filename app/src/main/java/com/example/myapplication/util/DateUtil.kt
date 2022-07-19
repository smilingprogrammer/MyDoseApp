package com.example.myapplication.util

import java.text.SimpleDateFormat
import java.util.*

fun Date.toFormattedString(): String {
    val sdf = SimpleDateFormat("LLLL dd, yyyy", Locale.getDefault())
    return sdf.format(this)
}