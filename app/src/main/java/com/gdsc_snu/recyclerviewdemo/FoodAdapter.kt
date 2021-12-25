package com.gdsc_snu.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_food.view.*

class FoodAdapter(
    val foods: List<Food>
): RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    inner class FoodViewHolder(foodView: View): RecyclerView.ViewHolder(foodView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.itemView.apply {
            ivFood.setImageResource(foods[position].image)
            tvFoodDescription.text = foods[position].description
        }
    }

    override fun getItemCount(): Int {
        return foods.size
    }
}