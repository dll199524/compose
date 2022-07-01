package com.example.composeproject.network


import com.example.composeproject.bean.EpidemicNews
import com.example.composeproject.utils.Constant.API_KEY
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("/ncov/index?key=$API_KEY")
    fun getEpidemicNews(): Call<EpidemicNews>
}