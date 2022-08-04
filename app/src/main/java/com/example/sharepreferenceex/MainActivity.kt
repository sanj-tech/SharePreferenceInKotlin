package com.example.sharepreferenceex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.sharepreferenceex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(LayoutInflater.from(this))
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setField()
        initView()

    }

    private fun setField() {
        var name=SharedPreferenceInfo(this).getString(Constant.userName)
        var  pass=SharedPreferenceInfo(this).getString(Constant.userPassword)
        binding.etName.setText(name)
        binding.etPass.setText(pass)
    }

    private fun initView() {

        binding.btnLogin.setOnClickListener({

            if (binding.etName.text.isBlank()&&binding.etPass.text.isBlank()){
                Toast.makeText(this,"please fill the field",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"Sucessful Login",Toast.LENGTH_LONG).show()


                val sharedPreferenceInfo=SharedPreferenceInfo(this)
                sharedPreferenceInfo.setString(Constant.userName,binding.etName.text.toString())
                sharedPreferenceInfo.setString(Constant.userPassword,binding.etPass.text.toString())
                sharedPreferenceInfo.setBool(Constant.isRemember,true)

                var intent=Intent(this,WelcomeActivity::class.java)
                intent.putExtra("name",binding.etName.text.toString())
                intent.putExtra("pass",binding.etPass.text.toString())
                startActivity(intent)

            }



        })
    }
}