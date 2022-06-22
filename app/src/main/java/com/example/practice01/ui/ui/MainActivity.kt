package com.example.practice01.ui.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.practice01.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    //premier value
    var username: String = "Lahcen"
    var password: String = "Lahcen123"

    //global value
    lateinit var edtName: EditText
    lateinit var edtPassword: EditText
    lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtName = findViewById(R.id.edt_name)
        edtPassword = findViewById(R.id.edt_password)
        loginBtn = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.login_btn -> {
                if (!edtName.text.isNullOrEmpty() && !edtPassword.text.isNullOrEmpty()) {
                    if (edtName.text.toString().equals(username) && edtPassword.text.toString()
                            .equals(password)
                    ) {
                        Toast.makeText(this, "9alwa", Toast.LENGTH_SHORT).show()
                        var intent: Intent = Intent(this, SecondActivity::class.java)

                         //send data to another layout
                        intent.putExtra("UserName",username.toString())
                        startActivity(intent)
                    }
                }
            }

        }
    }
}



