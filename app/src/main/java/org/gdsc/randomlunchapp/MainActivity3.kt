package org.gdsc.randomlunchapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.core.graphics.drawable.toDrawable
import org.gdsc.randomlunchapp.databinding.ActivityMain3Binding
import kotlin.random.Random

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setButton()
    }

    private fun setButton(){
        val toast = Toast.makeText(this, "이미지를 클릭해 상세 정보를 확인해보세요!", LENGTH_SHORT)

        binding.btnRun.setOnClickListener {
            val num = Random.nextInt(4)
            setImage(num)
            toast.show()
        }
    }

    private fun setImage(num: Int) {
        val imageResource = when (num) {
            1 -> R.drawable.img_result1
            2 -> R.drawable.img_result2
            3 -> R.drawable.img_result3
            else -> R.drawable.img_result4
        }

        binding.ivResult.setImageResource(imageResource)
        binding.ivResult.setOnClickListener {
            setWebLick(num)
        }
    }

    private fun setWebLick(num: Int) {
        val url = when (num) {
            1 -> "https://naver.me/GSiSNAKo"
            2 -> "https://naver.me/54V6GIiz"
            3 -> "https://naver.me/F9QpszKy"
            else -> "https://naver.me/GKox6S3g"
        }

        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
    }
}