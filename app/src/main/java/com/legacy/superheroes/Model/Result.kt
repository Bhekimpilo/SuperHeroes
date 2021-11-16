package com.legacy.superheroes.Model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "result")
data class Result(

    val biography: Biography,
    @PrimaryKey
    val id: String,
    val image: Image,
    val name: String
)