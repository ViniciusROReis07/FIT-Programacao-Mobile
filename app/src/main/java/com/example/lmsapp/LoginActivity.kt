package com.example.lmsapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.lmsapp.databinding.ActivityLoginBinding

class LoginActivity : DebugActivity() {

    private val context: Context get() = this

    private val binding by lazy{
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding.imgSala.setImageResource(R.drawable.arsenal)

        binding.btnLogin.setOnClickListener{
            onClickLogin()
        }

//        binding.btnTelaInicial.setOnClickListener{
//            onClickTelaInicial()
//        }
    }

//    fun onClickTelaInicial(){
//        val intent = Intent(context, TelaInicialActivity::class.java)
//        startActivity(intent)
//    }


    fun onClickLogin(){
        val texto = "Voce esta testando o Toast"
        val duration = Toast.LENGTH_LONG
        Toast.makeText(context, texto, duration).show()
//        binding.msgOp.text = "Voce clicou no botao LOGIN"
        var builder = AlertDialog.Builder(this)

        if(!binding.campoUsuario.text.toString().equals("Elisa")){
            builder.setTitle("Informacoes de login:")
            builder.setMessage("Usuario(a) NAO Cadastrado(a)")
            builder.create()
            builder.show()
        }else if(!binding.campoPassword.text.toString().equals("12345")){
            builder.setTitle("Informacoes de login:")
            builder.setMessage("Password Invalida")
            builder.create()
            builder.show()
        }else{
            val intent = Intent(context, TelaInicialActivity::class.java)
            startActivity(intent)
        }

    }
}