package com.example.composeproject.bean

data class GlobalStatistics(val currentConfirmedCount: Int = 0,
                            val confirmedCount: Int = 0,
                            val curedCount: Int = 0,
                            val currentConfirmedIncr: Int = 0,
                            val confirmedIncr: Int = 0,
                            val curedIncr: Int = 0,
                            val deadCount: Int = 0,
                            val deadIncr: Int = 0,
                            val yesterdayConfirmedCountIncr: Int = 0)