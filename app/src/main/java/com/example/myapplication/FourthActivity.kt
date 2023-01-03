package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityGlobalBinding

class FourthActivity : AppCompatActivity() {
    private val TAG = FourthActivity::class.java.simpleName
    private lateinit var binding: ActivityGlobalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGlobalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnOpenAActivity.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        Log.w(TAG, "on create and task id = $taskId")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.w(TAG, "on new intent and task id = $taskId")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w(TAG, "on destroy and task id = $taskId")
    }
}