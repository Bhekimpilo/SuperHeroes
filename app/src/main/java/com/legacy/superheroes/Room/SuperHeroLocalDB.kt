package com.legacy.superheroes.Room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.legacy.superheroes.Model.Biography
import com.legacy.superheroes.Model.Image
import com.legacy.superheroes.Model.Result
import com.legacy.superheroes.Model.SuperHeroModel

@Database(entities = [SuperHeroModel::class], version = 1)
abstract class SuperHeroLocalDB : RoomDatabase() {

    abstract fun daoAccess() : DAO
}