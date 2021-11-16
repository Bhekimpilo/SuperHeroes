package com.legacy.superheroes.Repository

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.legacy.superheroes.Model.SuperHeroModel
import com.legacy.superheroes.Networking.IGetSuperHeroByName
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://www.superheroapi.com/api.php/3026652450986917/"
class SuperheroRepository(val application: Application) {

    var resultsList = MutableLiveData<SuperHeroModel>()

    fun searchSuperHeroByName(name : String){

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(IGetSuperHeroByName::class.java)
 
        service.getSuperHeroByName(name).enqueue(object : Callback<SuperHeroModel> {
            override fun onFailure(call: Call<SuperHeroModel>, error: Throwable) {
                Toast.makeText(application, "Failure", Toast.LENGTH_SHORT).show()
                Log.d("RETROFIT", error.message)
            }

            override fun onResponse(call: Call<SuperHeroModel>, response: Response<SuperHeroModel>) {
                resultsList.value = response.body()
                Log.i("LIVEDATA", resultsList.value?.results.toString())
            }
        })


    }
}