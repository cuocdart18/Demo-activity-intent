package com.example.myapplication

import android.content.Intent
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
        val data = bundle?.get("data_object_1")
        Log.w(TAG, "data 1 = $data")
    }

    private fun passDataBackToMainActivity() {
        val data = User("em anh Giang", 20)
        Log.w(TAG, "data 2 = $data")

        val intent = Intent(this, MainActivity::class.java)
        val bundle = Bundle()
        bundle.putSerializable("data_object_2", data)
        intent.putExtras(bundle)
        setResult(2003, intent)
        finish()
    }
}