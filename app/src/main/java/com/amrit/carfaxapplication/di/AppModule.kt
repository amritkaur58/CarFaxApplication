package com.amrit.carfaxapplication.di

import com.amrit.carfaxapplication.data.remote.CarService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object AppModule {

    private val client = OkHttpClient.Builder().build()
    private val retrofit =
        Retrofit.Builder().baseUrl("https://carfax-for-consumers.firebaseio.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(client)
            .build()
            .create(CarService::class.java)

    fun buildService(): CarService {
        return retrofit
    }

}