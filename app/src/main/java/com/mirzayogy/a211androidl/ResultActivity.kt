package com.mirzayogy.a211androidl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val nameTextView = findViewById<TextView>(R.id.namaTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)

        val name = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val jumlahSks = intent.getIntExtra("jumlah_sks", 0)

        nameTextView.setText(name)
        emailTextView.setText(email)

    }
}