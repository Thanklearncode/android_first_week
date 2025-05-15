package com.example.baitaptuan1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TH2 : AppCompatActivity() {
    var btnCheck : Button = findViewById(R.id.btnCheck)
    var etEmail : EditText = findViewById(R.id.etEmail)
    var tNotify : TextView = findViewById(R.id.tNotify)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_th2)
        btnCheck.setOnClickListener {
            var regex = Regex("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}\$")
            if (regex.matches(etEmail.text.toString())) {
                tNotify.text = "Bạn đã nhập email hợp lệ"}
            else if(etEmail.text.toString().isEmpty()){
                tNotify.text = "Email không hợp lệ"}
            else {
                tNotify.text = "Email không đúng định dạng"}
            }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}