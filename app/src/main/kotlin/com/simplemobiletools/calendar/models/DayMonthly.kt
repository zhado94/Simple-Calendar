package com.simplemobiletools.calendar.models

data class DayMonthly(val value: Int, val isThisMonth: Boolean, val isToday: Boolean, val code: String, var hasEvent: Boolean, val weekOfYear: Int,
               var eventColors: ArrayList<Int>)
