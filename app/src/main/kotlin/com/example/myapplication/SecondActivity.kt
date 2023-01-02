package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val TAG = SecondActivity::class.java.simpleName
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRepassData.setOnClickListener { passDataBackToMainActivity() }

        // get data from main activity
        val bundle = intent.extras
        val data = bundle?.get("data_object")
        Log.w(TAG, "data = $data")
    }

    private fun passDataBackToMainActivity() {
        TODO("Not yet implemented")
    }
}