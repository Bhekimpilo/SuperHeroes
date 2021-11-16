package com.legacy.superheroes.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.legacy.superheroes.Model.Result
import com.legacy.superheroes.Model.SuperHeroModel
import com.legacy.superheroes.Repository.SuperheroRepository

class ResultListViewModel(application: Application) : AndroidViewModel(application){

    private var repository = SuperheroRepository(application)
    var resultList : LiveData<SuperHeroModel>

    init {
        resultList = repository.resultsList
    }


}