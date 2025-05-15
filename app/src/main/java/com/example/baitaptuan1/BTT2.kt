package com.example.baitaptuan1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BTT2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_btt2)
        var btnCheckAge: Button = findViewById(R.id.btnCheckAge)
        var etAge: EditText = findViewById(R.id.etAge)
        var tNodifyAge: TextView = findViewById(R.id.tNodifyAge)
        btnCheckAge.setOnClickListener {
        if(etAge.text.toString().toInt() >= 65) {
            tNodifyAge.setText("Người già")
        }
        else if(etAge.text.toString().toInt() >= 6){
            tNodifyAge.setText("Người lớn")
        }
        else if(etAge.text.toString().toInt() >= 2){
            tNodifyAge.setText("Trẻ em")
        }
        else if(etAge.text.toString().toInt() > 0){
            tNodifyAge.setText("Em bé")
        }
        else{
            tNodifyAge.setText("Tuổi không hợp lệ")
        }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}