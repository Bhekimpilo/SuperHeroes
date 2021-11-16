package com.legacy.superheroes.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.legacy.superheroes.Model.SuperHeroModel
import com.legacy.superheroes.Repository.SuperheroRepository

class SearchActivityViewModel(application: Application): AndroidViewModel(application) {

    private val repository = SuperheroRepository(application)
    var listOfResult : LiveData<SuperHeroModel>

    init {
        listOfResult = repository.resultsList
    }
    var move = false

    fun searchSuperHero(searchTerm : String){

        repository.searchSuperHeroByName(searchTerm)

    }


}