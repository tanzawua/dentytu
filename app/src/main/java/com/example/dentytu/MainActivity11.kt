package com.example.dentytu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        val boton5 = findViewById<Button>(R.id.historias)
        boton5.setOnClickListener {
            val lanzar5 = Intent(this, MainActivity4::class.java)
            startActivity(lanzar5)}


        val boton6 = findViewById<ImageView>(R.id.menu)
        boton6.setOnClickListener {
            val lanzar6 = Intent(this, MainActivity5::class.java)
            startActivity(lanzar6)}


        val boton7 = findViewById<ImageView>(R.id.casa)
        boton7.setOnClickListener {
            val lanzar7 = Intent(this, MainActivity3::class.java)
            startActivity(lanzar7)}


        val boton8 = findViewById<Button>(R.id.Contactar)
        boton8.setOnClickListener {
            val lanzar8 = Intent(this, MainActivity6::class.java)
            startActivity(lanzar8)}


        val boton9 = findViewById<ImageView>(R.id.buscar)
        boton9.setOnClickListener {
            val lanzar9 = Intent(this, MainActivity7::class.java)
            startActivity(lanzar9)}

        val boton10 = findViewById<Button>(R.id.pagos)
        boton10.setOnClickListener {
            val lanzar10 = Intent(this, MainActivity2::class.java)
            startActivity(lanzar10)}
    }
}