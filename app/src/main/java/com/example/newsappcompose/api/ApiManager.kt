package com.example.newsappcompose.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiManager {

    private var retrofit : Retrofit? = null

     private fun getInstance() : Retrofit{
         if(retrofit ==null){
             retrofit = Retrofit.Builder()
                 .baseUrl("https://newsapi.org/")
                 .addConverterFactory(GsonConverterFactory.create())
                 .build()
         }
        return retrofit!!
    }

    fun getApis() : WebServices {
        return  getInstance().create(WebServices::class.java)
    }

}