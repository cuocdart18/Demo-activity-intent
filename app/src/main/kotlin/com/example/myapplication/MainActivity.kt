package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPassData.setOnClickListener { passDataToSecondActivity() }
    }

    private fun passDataToSecondActivity() {
        val data = User("em anh Tung", 20)
        Log.w(TAG, "data = $data")

        val intent = Intent(this, SecondActivity::class.java)
        val bundle = Bundle()
        bundle.putSerializable("data_object", data)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}