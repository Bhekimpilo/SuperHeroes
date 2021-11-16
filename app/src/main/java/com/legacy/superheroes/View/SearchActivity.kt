package com.legacy.superheroes.View

import android.content.Intent
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.legacy.superheroes.R
import com.legacy.superheroes.ViewModel.SearchActivityViewModel
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity() {

    private lateinit var viewModel : SearchActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        viewModel = ViewModelProvider(this).get(SearchActivityViewModel::class.java)

        btnSearch.setOnClickListener {

            progressBar.visibility = VISIBLE

            if(searchEdit.text.toString().isNotEmpty()){

                viewModel.searchSuperHero(searchEdit.text.toString())

                //Wait for LiveData to be populated
                startActivity(Intent(this, ListActivity::class.java))

            }else
                Toast.makeText(this, "No text entered", Toast.LENGTH_SHORT).show()

            progressBar.visibility = GONE



        }

    }

}