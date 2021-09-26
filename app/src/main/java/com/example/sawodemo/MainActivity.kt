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
                "7b9293df-8432-4a59-907f-01db93d559aa", // your api key
                "614cdb0dec39c0c001ec5cecgIuTa6WbQSKLCZVShF4bioR8"  // your api key secret
            ).login(
                "email", // can be one of 'email' or 'phone_number_sms'
                HomeActivity::class.java.name // Callback class name
            )
        }
    }
}