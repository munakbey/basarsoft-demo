package com.app.demo.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.munevver.basarsoft.model.User

@Entity(foreignKeys = arrayOf(
    ForeignKey(
            entity = User::class,
            parentColumns = ["id"],
            childColumns = ["userId"],
            onDelete = ForeignKey.CASCADE, // or any other strategy
            onUpdate = ForeignKey.CASCADE, // or any other strategy)
        )
    )
)
data class Work(
        var workOder: String = "",
        var workOrderDetail: String = "",
        var latitude: Double = 0.0,
        var longitude: Double = 0.0,
        var userId: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}