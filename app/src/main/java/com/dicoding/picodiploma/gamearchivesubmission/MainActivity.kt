package com.dicoding.picodiploma.gamearchivesubmission

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.dicoding.picodiploma.gamearchivesubmission.adapter.CardViewAdapter
import com.dicoding.picodiploma.gamearchivesubmission.model.GameData.listData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showRecyclerCardView()

//        setSupportActionBar(findViewById(R.id.custom_toolbar))
    }

    private fun showRecyclerCardView() {
        rvGame.layoutManager  = LinearLayoutManager(this)
        val cardViewGameAdapter = CardViewAdapter(this, listData)
        rvGame.adapter = cardViewGameAdapter
    }
}
