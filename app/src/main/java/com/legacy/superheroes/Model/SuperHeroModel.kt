package com.legacy.superheroes.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "superhero")
data class SuperHeroModel(

    val response: String,
    val results: List<Result>,
    @PrimaryKey
    val resultsFor: String
)