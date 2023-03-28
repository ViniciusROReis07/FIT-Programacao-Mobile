package com.example.lmsapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lmsapp.databinding.ActivityLoginBinding


class MainActivity : AppCompatActivity() {

    private val context: Context get() = this


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        /*
        binding.imgSala.setImageResource(R.drawable.arsenal)
        binding.txtLogin.text = "Faca o seu login no Sistema Empresa"
        */
        binding.root.setOnClickListener{
            onClickLogin()
        }
    }

    /*fun onClickLogin(){
        val valorUsuario = binding.campoUsuario.text.toString()
        val valorPassword = binding.campoPassword.text.toString()

        Toast.makeText(this, "Voce clicou no botao login, $valorUsuario : $valorPassword", Toast.LENGTH_SHORT ).show()
    }*/

    fun onClickLogin(){
        val intent = Intent(context, LoginActivity::class.java)
        startActivity(intent)
    }

    private val binding by lazy{
        ActivityLoginBinding.inflate(layoutInflater)
    }
}