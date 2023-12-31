package com.example.roomdatabase.data
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: String,
    val firstName: String,
    val lastName: String,
    val age: Int,
)


