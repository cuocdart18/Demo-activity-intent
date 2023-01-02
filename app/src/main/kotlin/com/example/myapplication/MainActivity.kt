package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName
    private lateinit var binding: ActivityMainBinding
    private val activityResultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == 2003) {
                val intent = result.data
                val bundle = intent?.extras
                val data = bundle?.get("data_object_2")
                Log.w(TAG, "data 2 = $data")
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPassData.setOnClickListener { passDataToSecondActivity() }
    }

    private fun passDataToSecondActivity() {
        val data = User("em anh Tung", 20)
        Log.w(TAG, "data 1 = $data")

        val intent = Intent(this, SecondActivity::class.java)
        val bundle = Bundle()
        bundle.putSerializable("data_object_1", data)
        intent.putExtras(bundle)

        activityResultLauncher.launch(intent)
    }
}