package com.legacy.superheroes.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "biography")
data class Biography(

    @PrimaryKey
    val fullName: String,
    val aliases: List<String>,
    val alignment: String,
    val alterEgos: String,
    val firstAppearance: String,
    val placeOfBbirth: String,
    val publisher: String
)