package com.example.sharepreferenceex

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.sharepreferenceex.databinding.ActivityWelcomeBinding

class WelcomeActivity: AppCompatActivity() {
    lateinit var binding: ActivityWelcomeBinding
   // lateinit var sharedPreferenceInfo: SharedPreferenceInfo
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityWelcomeBinding.inflate(LayoutInflater.from(this))
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
       var intent=getIntent()
        var myName=intent.getStringExtra("name")
       var mypass= intent.getStringExtra("pass")

        binding.txtName.text=myName
        binding.txtpass.text=mypass


    }
}