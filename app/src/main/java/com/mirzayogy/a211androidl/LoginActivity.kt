package com.mirzayogy.a211androidl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        val keluarButton = findViewById<Button>(R.id.keluarButton)

        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)

        keluarButton.setOnClickListener {
            finish()
        }

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if(username == "admin" && password == "admin"){
                val sharedPreferences = this.getSharedPreferences("ANDROID_L", MODE_PRIVATE)
                with(sharedPreferences.edit()){
                    putString("USERNAME",username)
                    apply()
                }
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this,"username/password salah",Toast.LENGTH_SHORT).show()
            }
        }

    }
}