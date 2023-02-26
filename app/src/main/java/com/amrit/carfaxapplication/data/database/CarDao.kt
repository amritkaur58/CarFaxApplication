package com.amrit.carfaxapplication.data.database

import androidx.room.*
import com.amrit.carfaxapplication.data.entities.CarList
import com.amrit.carfaxapplication.data.entities.Listings

@Dao
interface CarDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addCar(car: ArrayList<CarList>?)

    @Update
    suspend fun updateUser(car: CarList)

    @Delete
    suspend fun deleteUser(car: CarList)


}