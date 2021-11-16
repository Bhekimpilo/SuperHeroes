package com.legacy.superheroes.Networking

import com.legacy.superheroes.Model.Result
import com.legacy.superheroes.Model.SuperHeroModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IGetSuperHeroByName {

    @GET("search/{name}")
    fun getSuperHeroByName(@Path("name") searchTerm: String) : Call<SuperHeroModel>
}