package com.example.jettodo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Task::class], version = 1)
abstract class AppDatabase :RoomDatabase(){
    abstract fun taskDao(): TaskDao

}