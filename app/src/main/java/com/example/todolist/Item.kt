package com.example.todolist

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "items")
class Item (
    @PrimaryKey(autoGenerate = true)
        )