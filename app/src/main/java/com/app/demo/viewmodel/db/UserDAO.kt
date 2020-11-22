package com.app.demo.viewmodel.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.munevver.basarsoft.model.User

@Dao
interface UserDAO {

    @Insert
    suspend fun addUser(vararg user : User)

    @Query("SELECT * FROM user WHERE username = :username")
    suspend fun getUser(username : String) : List<User>
}