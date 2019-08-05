package com.dicoding.picodiploma.gamearchivesubmission

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import com.dicoding.picodiploma.gamearchivesubmission.adapter.CardViewAdapter
import com.dicoding.picodiploma.gamearchivesubmission.model.GameData.listData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolb = findViewById<Toolbar>(R.id.custom_toolbar)
        setSupportActionBar(toolb)

//
//        if (supportActionBar != null) {
//            val customActionBar = (supportActionBar as ActionBar)
//            customActionBar.title = "Game Archive"
//        }


        showRecyclerCardView()


//        setSupportActionBar(findViewById(R.id.custom_toolbar))
    }

    private fun showRecyclerCardView() {
        rvGame.layoutManager  = LinearLayoutManager(this)
        val cardViewGameAdapter = CardViewAdapter(this, listData)
        rvGame.adapter = cardViewGameAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode) {
           R.id.about_menu -> {
               runOnUiThread {
                   val moveIntent = Intent(this, AboutActivity::class.java)
                   startActivity(moveIntent)
               }
           }
        }
    }


}
