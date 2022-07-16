package com.example.dentytu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val boton1 = findViewById<ImageView>(R.id.retroceder)
        boton1.setOnClickListener {
            val lanzar1 = Intent(this, MainActivity::class.java)
            startActivity(lanzar1)}

        val boton2 = findViewById<Button>(R.id.registar)
        boton2.setOnClickListener {
            val lanzar2 = Intent(this, MainActivity3::class.java)
            startActivity(lanzar2)}


    }
}