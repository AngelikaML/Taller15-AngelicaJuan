package com.example.taller15

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import com.google.android.material.card.MaterialCardView

class MenuPrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        val cardCalculadora = findViewById<MaterialCardView>(R.id.cardCalculadora)
        //val cardNotas = findViewById<MaterialCardView>(R.id.cardNotas)
        //val cardPerfil = findViewById<MaterialCardView>(R.id.cardPerfil)
        //val cardAjustes = findViewById<MaterialCardView>(R.id.cardAjustes)

        cardCalculadora.setOnClickListener {
            startActivity(Intent(this, CalculadoraActivity::class.java))
        }
    }
}