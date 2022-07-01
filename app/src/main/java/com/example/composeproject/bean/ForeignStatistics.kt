package com.example.composeproject.bean

data class ForeignStatistics(val currentConfirmedCount: Int = 0,
                             val confirmedCount: Int = 0,
                             val curedCount: Int = 0,
                             val currentConfirmedIncr: Int = 0,
                             val suspectedIncr: Int = 0,
                             val confirmedIncr: Int = 0,
                             val curedIncr: Int = 0,
                             val deadCount: Int = 0,
                             val deadIncr: Int = 0,
                             val suspectedCount: Int = 0)