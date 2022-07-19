package com.example.myapplication.util

enum class TimeGroup {
    Daily,
    Weekly,
    Monthly
}

fun getRecurrenceList(): List<TimeGroup>{
    val recurrenceList = mutableListOf<TimeGroup>()
    recurrenceList.add(TimeGroup.Daily)
    recurrenceList.add(TimeGroup.Weekly)
    recurrenceList.add(TimeGroup.Monthly)

    return recurrenceList
}