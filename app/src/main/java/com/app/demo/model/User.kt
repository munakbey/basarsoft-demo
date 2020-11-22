package com.munevver.basarsoft.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User (
    val username: String,
    val password : String

){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}