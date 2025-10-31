package com.example.ping_pong

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide


class Player : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.player_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imageView: ImageView = findViewById(R.id.imageView)
        Glide.with(this).load(R.drawable.stick_bug_rick_roll).into(imageView)


        val intent = Intent(this@Player,game::class.java)
        var quant = 1
        val nome = findViewById<Button>(R.id.nome)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn4 = findViewById<Button>(R.id.btn4)

        btn1.setOnClickListener {
            quant = 1
            teste(quant)
        }
        btn2.setOnClickListener {
            quant = 2
            teste(quant)
        }
        btn4.setOnClickListener {
            quant = 4
            teste(quant)
        }
        val nome1 = nome.text.toString()

        intent.putExtra("quantidade", quant)
        intent.putExtra("nome1", nome1)
    }
    fun teste(quant){
        startActivity(intent)
    }





}