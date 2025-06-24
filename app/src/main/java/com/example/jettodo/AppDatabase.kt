package com.example.jettodo

import androidx.room.Database

@Database(entities = [Task::class], version = 1, exportSchema = false)  
class AppDatabase {
}