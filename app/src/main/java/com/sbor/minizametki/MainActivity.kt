package com.sbor.minizametki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sbor.minizametki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        binding.btnAdd.setOnClickListener {
            if (binding.edText.text.isNotEmpty())
                list.add((binding.edText.text.toString()))
            binding.edText.text.clear()
        }
        binding.output.setOnClickListener {
            list.forEach {
                binding.tvResult.append("$it\n")
            }
        }
    }
}