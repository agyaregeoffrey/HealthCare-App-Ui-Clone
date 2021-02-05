package com.gka.healthcareapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.gka.healthcareapp.R
import com.gka.healthcareapp.offline.PrefManager
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: TextInputEditText
    private lateinit var textInputLayout: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInputLayout = findViewById(R.id.textInputLayout)
        nameEditText = findViewById(R.id.name_edit_text)
        val getStartedButton: Button = findViewById(R.id.getStartedButton)
        getStartedButton.setOnClickListener {
            saveUserName()
        }

    }

    private fun saveUserName() {
        val name = nameEditText.text.toString()

        if (name.isEmpty()) {
            textInputLayout.error = "Field cannot be empty"
            return
        }
        PrefManager.getInstance(applicationContext).saveUserInfo(name)
        startActivity(Intent(MainActivity@this, LandingActivity::class.java))
    }
}