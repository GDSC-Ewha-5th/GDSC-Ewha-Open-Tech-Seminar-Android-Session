package org.gdsc.randomlunchapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.gdsc.randomlunchapp.databinding.ActivityMain2Binding
import org.gdsc.randomlunchapp.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setButton()
    }

    private fun setButton(){
        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}