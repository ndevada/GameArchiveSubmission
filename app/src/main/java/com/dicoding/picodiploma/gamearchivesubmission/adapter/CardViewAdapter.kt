package com.dicoding.picodiploma.gamearchivesubmission.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.gamearchivesubmission.GameDetails
import com.dicoding.picodiploma.gamearchivesubmission.MainActivity
import com.dicoding.picodiploma.gamearchivesubmission.R
import com.dicoding.picodiploma.gamearchivesubmission.model.Game

class CardViewAdapter(context: Context, private val listGame: ArrayList<Game>): RecyclerView.Adapter<CardViewAdapter.CardViewHolder>() {
    private val activity: Context = context
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CardViewHolder {
        val view: View = LayoutInflater.from(p0.context).inflate(R.layout.item_card_view, p0, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listGame.size
    }

    override fun onBindViewHolder(p0: CardViewHolder, p1: Int) {
        val (name, img, genre, platforms, releaseDate, developers, publisher, alt_name, game_mode, img_detail, desc) = listGame[p1]

        Glide.with(p0.itemView.context)
            .load(img)
            .apply(RequestOptions().override(400, 300))
            .into(p0.imgPhoto)

        p0.tvName.text = name
        p0.releaseDate.text = releaseDate
        p0.tvGenre.text = genre

        val moveIntent = Intent(activity, GameDetails::class.java)
        moveIntent.putExtra(GameDetails.EXTRA_IMG, img)
        moveIntent.putExtra(GameDetails.EXTRA_IMG_DETAIL, img_detail)
        moveIntent.putExtra(GameDetails.EXTRA_TITLE, name)
        moveIntent.putExtra(GameDetails.EXTRA_GENRE, genre)
        moveIntent.putExtra(GameDetails.EXTRA_DATE, releaseDate)
//        moveIntent.putExtra(GameDetails.EXTRA_SCORE, score)
        moveIntent.putExtra(GameDetails.EXTRA_PUB, publisher)
        moveIntent.putExtra(GameDetails.EXTRA_DEV, developers)
        moveIntent.putExtra(GameDetails.EXTRA_DESC, desc)
        moveIntent.putExtra(GameDetails.EXTRA_PLATFORMS, platforms)
        moveIntent.putExtra(GameDetails.EXTRA_MODE, game_mode)
        moveIntent.putExtra(GameDetails.EXTRA_OTHER_TITLE, alt_name)
        p0.itemView.setOnClickListener { activity.startActivity(moveIntent) }

    }

    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView  = itemView.findViewById(R.id.tv_img)
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvGenre: TextView = itemView.findViewById(R.id.tv_genre)
        var releaseDate: TextView = itemView.findViewById(R.id.release_date)
    }

}