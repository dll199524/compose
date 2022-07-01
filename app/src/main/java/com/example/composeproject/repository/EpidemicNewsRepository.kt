package com.example.composeproject.repository

import com.example.composeproject.network.NetWorkRequest
import com.example.composeproject.utils.Constant.CODE
import kotlinx.coroutines.Dispatchers
import java.lang.RuntimeException

class EpidemicNewsRepository : BaseRepository() {

    fun getEpidemicNews() = fire(Dispatchers.IO) {
        val epidemicNews = NetWorkRequest.getEpidemicNews()
        if (epidemicNews.code == CODE) Result.success(epidemicNews)
        else Result.failure(RuntimeException("get news response is : ${epidemicNews.code} msg is : ${epidemicNews.msg}"))
    }
}