package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.w(TAG, "on create")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        binding.btnOpenDialog.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this).create().apply {
                setTitle("em anh Tung")
                setMessage("em anh Giang")
                setButton(AlertDialog.BUTTON_NEGATIVE, "close") { dialog, which ->
                    dialog.cancel()
                }
            }
            alertDialog.show()
        }
        binding.btnOpenFinishActivity.setOnClickListener { finish() }
    }

    override fun onStart() {
        super.onStart()
        Log.w(TAG, "on start")
    }

    override fun onResume() {
        super.onResume()
        Log.w(TAG, "on resume")
    }

    override fun onPause() {
        super.onPause()
        Log.w(TAG, "on pause")
    }

    override fun onStop() {
        super.onStop()
        Log.w(TAG, "on stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w(TAG, "on restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w(TAG, "on destroy")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.w(TAG, "on back pressed")
    }
}