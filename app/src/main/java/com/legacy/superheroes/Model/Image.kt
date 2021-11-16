package com.legacy.superheroes.Model

import androidx.room.Entity

@Entity(tableName = "image")
data class Image(
    val url: String
)