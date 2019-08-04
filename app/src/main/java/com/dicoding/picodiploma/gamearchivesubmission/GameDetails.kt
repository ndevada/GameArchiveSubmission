package com.dicoding.picodiploma.gamearchivesubmission

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_game_details.*

class GameDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_details)

        val img = intent.getStringExtra(EXTRA_IMG)
        val imgDetail = intent.getStringExtra(EXTRA_IMG_DETAIL)
        val title = intent.getStringExtra(EXTRA_TITLE)
        val genre = intent.getStringExtra(EXTRA_GENRE)
        val releaseDate = intent.getStringExtra(EXTRA_DATE)
//        val score = intent.getStringExtra(EXTRA_SCORE)
        val publisher = intent.getStringExtra(EXTRA_PUB)
        val developer = intent.getStringExtra(EXTRA_DEV)
        val desc = intent.getStringExtra(EXTRA_DESC)
        val gameMode = intent.getStringExtra(EXTRA_MODE)
        val platforms = intent.getStringExtra(EXTRA_PLATFORMS)
        val altName = intent.getStringExtra(EXTRA_OTHER_TITLE)

        title_detail.text = title
        genre_detail.text = genre
        release_date_detail.text = releaseDate
//        score_detail.text = score
        publisher_detail.text = publisher
        developer_detail.text = developer
        desc_detail.text = desc
        game_mode.text = gameMode
        platforms_detail.text = platforms
        alt_name_detail.text = altName

//        Glide.with(this)
//            .load(img)
//            .apply(RequestOptions().override(380, 200))
//            .into(findViewById(R.id.cvr_img_details))

        loadImage(this, img, 380, 200, R.id.cvr_img_details)

//        Glide.with(this)
//            .load(imgDetail)
//            .apply(RequestOptions().override(100, 150))
//            .into(findViewById(R.id.img_details))

    }

    companion object {
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_IMG_DETAIL = "extra_img_detail"
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_GENRE = "extra_genre"
        const val EXTRA_DATE = "extra_date"
//        const val EXTRA_SCORE = "extra_score"
        const val EXTRA_PUB = "extra_pub"
        const val EXTRA_DEV = "extra_dev"
        const val EXTRA_DESC = "extra_detail"
        const val EXTRA_PLATFORMS = "extra_platforms"
        const val EXTRA_MODE = "extra_mode"
        const val EXTRA_OTHER_TITLE = "extra_other_title"
    }


    private fun loadImage(context: Context, img: String, width: Int, height: Int, id: Int) {
        Glide.with(context)
            .load(img)
            .apply(RequestOptions().override(width, height))
            .into(findViewById(id))
    }
}
