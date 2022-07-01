package com.example.composeproject.bean

data class EpidemicNews(val msg: String = "",
                        val code: Int = 0,
                        val newslist: List<NewslistItem>?)