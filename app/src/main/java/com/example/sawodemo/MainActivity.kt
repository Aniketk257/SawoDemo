package com.example.sawodemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sawodemo.databinding.ActivityMainBinding
import com.sawolabs.androidsdk.Sawo

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener{
            Sawo(
                this,
                "", // your api key
                ""  // your api key secret
            ).login(
                "email", // can be one of 'email' or 'phone_number_sms'
                HomeActivity::class.java.name // Callback class name
            )
        }
    }
}