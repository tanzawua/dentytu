package com.example.dentytu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
//ir ala actividad principal
        val boton1 = findViewById<ImageView>(R.id.retroceder)
        boton1.setOnClickListener {
            val lanzar1 = Intent(this, MainActivity3::class.java)
            startActivity(lanzar1)}



//guardar la informacion
        val guardar=findViewById<Button>(R.id.guardar)
        guardar.setOnClickListener {

        }
    }
}