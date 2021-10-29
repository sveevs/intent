package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.sax.StartElementListener
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val NextB : Button = findViewById(R.id.Next_button)

        val intentT = Intent(this, SecondActivity::class.java)

        NextB.setOnClickListener {
            ActivityResultContracts.StartActivityForResult(intentT)

        }


    }
}