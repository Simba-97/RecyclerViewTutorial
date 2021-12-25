package com.gdsc_snu.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodList = mutableListOf(
            Food(R.drawable.butter_chicken, "Butter Chicken"),
            Food(R.drawable.spaghetti, "Spaghetti"),
            Food(R.drawable.cookies, "Choco Cookies"),
            Food(R.drawable.salad, "Mixed Salad"),
            Food(R.drawable.pizza, "Pizza")
        )

        val adapter = FoodAdapter(foodList)
        rvFood.adapter = adapter
        rvFood.layoutManager = LinearLayoutManager(this)
    }
}