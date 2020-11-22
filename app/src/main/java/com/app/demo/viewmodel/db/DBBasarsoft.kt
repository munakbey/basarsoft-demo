package com.app.demo.viewmodel.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.app.demo.model.Work
import com.munevver.basarsoft.model.User


@Database(entities = arrayOf(User::class, Work::class), version = 3)
abstract class DBBasarsoft : RoomDatabase() {

    abstract fun userDAO() : UserDAO
    abstract fun workDAO() : WorkDAO

    companion object{
        @Volatile
        private var instance : DBBasarsoft?= null

        private val lock = Any()

        var MIGRATION_1_2: Migration = object : Migration(1, 3) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("CREATE TABLE work(workOrder Text , workOrderDetail Text , lar Real , long Real ," +
                        " id Integer Primary Key ASC , userid Integer)")
            }
        }

        operator fun invoke(context: Context) = instance ?: synchronized(lock) {
            instance ?: createDB(context).also {
                instance = it
            }
        }

        private fun createDB(context: Context) = Room.databaseBuilder(
                context.applicationContext,
                DBBasarsoft::class.java, "basarsoft"

        ).build()
    }


}
