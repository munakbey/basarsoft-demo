package com.app.demo.viewmodel.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.app.demo.model.Work

@Dao
interface WorkDAO {

    @Insert
    suspend fun addWork(work: Work)

    @Query("SELECT * FROM work WHERE id = :id")
    suspend fun getWorkById(id: Int) : List<Work>

    @Query("SELECT * FROM work WHERE userId = :id")
    suspend fun getWorkByUserId(id: Int) : List<Work>
}