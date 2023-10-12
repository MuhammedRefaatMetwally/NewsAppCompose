package com.example.newsappcompose.api

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {


    @Provides
    fun provideLoggingInterceptor() : HttpLoggingInterceptor{
        val loggingInterceptor = HttpLoggingInterceptor{
            Log.e("api", it)
        }
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        return  loggingInterceptor
    }

    @Provides
    fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    }

    @Provides
    fun provideGsonConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    @Provides
    fun provideRetrofit(
     okHttpClient: OkHttpClient,
     gsonConverterFactory: GsonConverterFactory
    ) : Retrofit{
    return  Retrofit.Builder()
        .baseUrl("https://newsapi.org/")
        .client(okHttpClient)
        .addConverterFactory(gsonConverterFactory)
        .build()
    }


    @Provides
    fun getNewsService(retrofit: Retrofit) : WebServices{
        return  retrofit.create(WebServices::class.java)
    }
}