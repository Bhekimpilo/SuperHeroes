package com.legacy.superheroes.ViewModel

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.legacy.superheroes.Model.Result
import com.legacy.superheroes.R
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.result_item.view.*
import java.util.*

class SuperHeroListAdapter(private val context: Context) :
    RecyclerView.Adapter<SuperHeroListAdapter.ViewHolder>(){

    private var list: List<Result> = ArrayList()

    fun setResultList(list : List<Result>){
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(view: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.result_item, view, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.name.text = list[position].name
        viewHolder.id.text = list[position].id
        Glide.with(context)
            .load(list[position].image)
            .into(viewHolder.image)
        viewHolder.rootView.setOnClickListener {
            Toast.makeText(context, "Item ${list[position]} was clicked", Toast.LENGTH_SHORT).show();
        }
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val name = v.superheroName
        val id = v.superheroID
        val image = v.superheroPic
        val rootView = v.listview_child
    }
}