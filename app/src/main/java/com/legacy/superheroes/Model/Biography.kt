package com.legacy.superheroes.Model

data class Biography(

    val fullName: String,
    val aliases: List<String>,
    val alignment: String,
    val alterEgos: String,
    val firstAppearance: String,
    val placeOfBbirth: String,
    val publisher: String
)