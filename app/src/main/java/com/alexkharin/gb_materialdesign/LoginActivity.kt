package com.alexkharin.gb_materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun login(view: View){
        val intentToInActivity = Intent(this,InActivity::class.java)
        if(username.length()>0) {
            startActivity(intentToInActivity)
        } else {
            val snackBar = Snackbar.make(view, "Введите имя", Snackbar.LENGTH_INDEFINITE)
            snackBar.setAction("Ok"){}
            snackBar.show()
        }
    }
    fun close_all(view: View){
        finishAffinity()
    }
}
