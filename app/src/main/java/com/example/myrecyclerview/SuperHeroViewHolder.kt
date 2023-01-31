package com.example.myrecyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val superHero = view.findViewById<TextView>(R.id.tvSuperHeroName)
    val realName = view.findViewById<TextView>(R.id.tvrealSuperName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val photo = view.findViewById<ImageView>(R.id.ivSuperHero)

    fun render(superHeroModel: SuperHero) {
        superHero.text = superHeroModel.superHero
        superHero.text = superHeroModel.realName
        superHero.text = superHeroModel.publisher
    }
}