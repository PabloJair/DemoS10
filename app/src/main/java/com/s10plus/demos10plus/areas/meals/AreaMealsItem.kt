package com.s10plus.demos10plus.areas.meals

import android.os.AsyncTask
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.s10plus.demos10plus.core.BaseViewHolder
import com.s10plus.demos10plus.databinding.AreaItemBinding
import com.s10plus.demos10plus.meal.remote.entities.ItemMealArea
import com.s10plus.demos10plus.meal.remote.entities.Meals

class AreaMealsItem(viewGroup: ViewGroup):BaseViewHolder<AreaItemBinding,ItemMealArea>(AreaItemBinding.inflate(
    LayoutInflater.from(viewGroup.context),viewGroup,false)) {

    override fun setup(item: ItemMealArea) {
        binding.areaName.text = item.strArea

        Glide.with(binding.root).load("https://picsum.photos/seed/picsum/50").into(binding.image)


    }


}