package com.example.composeproject.bean

data class NewsItem(val summary: String = "",
                    val sourceUrl: String = "",
                    val id: Int = 0,
                    val title: String = "",
                    val pubDate: Long = 0,
                    val pubDateStr: String = "",
                    val infoSource: String = "")