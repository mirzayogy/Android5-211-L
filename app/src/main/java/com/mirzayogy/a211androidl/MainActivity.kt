package com.mirzayogy.a211androidl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        val tanggalLahirEditText = findViewById<EditText>(R.id.tanggalLahirEditText)
        val jumlahSksEditText = findViewById<EditText>(R.id.jumlahSksEditText)

        simpanButton.setOnClickListener {
            val nama = namaEditText.text.toString()
            var jumlahSks = jumlahSksEditText.text.toString().toInt()
            jumlahSks = 160 - jumlahSks
            Toast.makeText(this,"Sisa SKS... $jumlahSks",Toast.LENGTH_SHORT).show()
        }

        batalButton.setOnClickListener {
            Toast.makeText(this,"batal..",Toast.LENGTH_SHORT).show()
        }
    }
}