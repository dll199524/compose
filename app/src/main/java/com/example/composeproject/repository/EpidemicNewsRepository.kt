package com.example.composeproject.repository

import com.example.composeproject.network.NetWorkRequest
import com.example.composeproject.utils.Constant.CODE
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.Dispatchers
import java.lang.RuntimeException
import javax.inject.Inject

@ViewModelScoped
class EpidemicNewsRepository @Inject constructor(): BaseRepository() {

    fun getEpidemicNews() = fire(Dispatchers.IO) {
        val epidemicNews = NetWorkRequest.getEpidemicNews()
        if (epidemicNews.code == CODE) Result.success(epidemicNews)
        else Result.failure(RuntimeException("get news response is : ${epidemicNews.code} msg is : ${epidemicNews.msg}"))
    }
}