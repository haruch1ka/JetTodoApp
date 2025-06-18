package com.example.jettodoapp

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class Task (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String,
        )