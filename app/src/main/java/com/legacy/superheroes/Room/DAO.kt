package com.legacy.superheroes.Room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.legacy.superheroes.Model.SuperHeroModel

@Dao
interface DAO {

    @Query("SELECT * FROM  superhero WHERE resultsFor LIKE '% :name %'")
    fun getSuperHeroByName(name : String) : SuperHeroModel

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addSuperHeros(results : SuperHeroModel)
}