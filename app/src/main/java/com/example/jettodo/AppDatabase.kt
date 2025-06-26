package com.example.jettodo

import androidx.room.Database

@Database(entities = [Task::class], version = 1)
abstract class AppDatabase {
    abstract fun taskDao(): TaskDao

}