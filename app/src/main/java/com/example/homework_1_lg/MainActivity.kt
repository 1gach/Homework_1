package com.example.homework_1_lg

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var enterNameInput: EditText
    private lateinit var okayBtn: Button
    private lateinit var nextBtn: Button
    private lateinit var nameview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initVars()
        setListeners()
    }

    private fun initVars() {
        enterNameInput = findViewById(R.id.hello_name_text)
        okayBtn = findViewById(R.id.okay_button)
        nextBtn = findViewById(R.id.next_button)
        nameview = findViewById(R.id.nameView)
    }

    private fun setListeners() {
        okayBtn.setOnClickListener {
            val nameInput = enterNameInput.text.toString()
            nameview.text = nameInput

        }
        nextBtn.setOnClickListener {
            navigateToSecondScreen()
        }

    }

    private fun navigateToSecondScreen() {
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(intent)
    }
}
