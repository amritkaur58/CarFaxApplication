package com.amrit.carfaxapplication.repository

import com.amrit.carfaxapplication.data.database.CarDao
import com.amrit.carfaxapplication.data.entities.CarList

class CarRepository(private val carDao: CarDao) {
    suspend fun addCar(car: ArrayList<CarList>?) {
        carDao.addCar(car)
    }

    suspend fun updateCar(car: CarList) {
        carDao.updateUser(car)
    }
}