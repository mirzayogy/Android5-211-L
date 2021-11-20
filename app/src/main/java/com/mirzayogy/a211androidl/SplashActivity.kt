package com.mirzayogy.a211androidl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        getSupportActionBar()?.hide()

        Handler(Looper.getMainLooper()).postDelayed({

            val sharedPreferences = this.getSharedPreferences("ANDROID_L", MODE_PRIVATE)
            val username = sharedPreferences.getString("USERNAME","")

            if(username==""){
                val intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }


            finish()
        }, 2000)
    }
}