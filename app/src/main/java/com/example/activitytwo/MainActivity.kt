package com.example.activitytwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val text = editText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("text", text)
            startActivity(intent)
        }
    }

    fun sendText(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val text = editText.text.toString()
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("text", text)
        startActivity(intent)
    }
}