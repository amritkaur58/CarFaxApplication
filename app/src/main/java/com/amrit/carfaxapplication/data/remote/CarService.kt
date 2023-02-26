package com.amrit.carfaxapplication.data.remote

import com.amrit.carfaxapplication.data.entities.CarData
import io.reactivex.Observable
import retrofit2.http.GET

interface CarService {

    @GET("assignment.json")
    fun getCarList(): Observable<CarData>
}