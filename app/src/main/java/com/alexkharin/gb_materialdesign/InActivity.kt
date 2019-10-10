package com.alexkharin.gb_materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.Toolbar
import android.content.Intent
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_in.*
import kotlinx.android.synthetic.main.app_bar_main.*


class InActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_in)

        fab_in.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val intent = intent

        val type = intent.getStringExtra("type")
        when(type){
            "nature" ->{
                imageView2.setImageResource(R.drawable.img_nature)
            }
            "fruits" ->{
                imageView2.setImageResource(R.drawable.img_fruits)
            }
            "vegetables" ->{
                imageView2.setImageResource(R.drawable.img_vegetables)
            }
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        when (id) {
            android.R.id.home -> {
                Log.d(TAG, "onOptionsItemSelected: ")
                onBackPressed()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    companion object {

        private val TAG = "ToolbarActivity"
    }

}
