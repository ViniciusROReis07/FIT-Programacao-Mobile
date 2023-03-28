package com.example.lmsapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmsapp.databinding.ActivityTelaInicialBinding

class TelaInicialActivity : DebugActivity() {

    val context: Context get() = this


    private val binding by lazy {
        ActivityTelaInicialBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnPaises.setOnClickListener{
            onCLickPaises()
        }
    }

    fun onCLickPaises() {
        val intent = Intent(context, PaisesActivity::class.java)
        val params = Bundle()
        val nomePais = binding.campPaises.text.toString()
        params.putString("nome", nomePais)
        intent.putExtras(params)
        startActivity(intent)
    }
}