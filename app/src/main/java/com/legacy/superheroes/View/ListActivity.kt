package com.legacy.superheroes.View

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import androidx.room.RoomDatabase
import com.legacy.superheroes.R
import com.legacy.superheroes.Repository.SuperheroRepository
import com.legacy.superheroes.Room.SuperHeroLocalDB
import com.legacy.superheroes.ViewModel.ResultListViewModel
import com.legacy.superheroes.ViewModel.SuperHeroListAdapter
import kotlinx.android.synthetic.main.result_list.*

class ListActivity : AppCompatActivity() {

    private lateinit var viewModel : ResultListViewModel
    private lateinit var repo : SuperheroRepository
    private lateinit var adapter : SuperHeroListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result_list)

        viewModel = ViewModelProvider(this).get(ResultListViewModel::class.java)

        recylerView.layoutManager = LinearLayoutManager(this)
        adapter = SuperHeroListAdapter(application)
        recylerView.adapter = adapter

        viewModel.resultList.observe(this, Observer {
            adapter.setResultList(it.results)
        })




    }

}